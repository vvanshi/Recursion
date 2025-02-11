import java.util.ArrayList;
import java.util.Collections;

public class SubSum1 {
    // Recursive function to generate all subset sums
    static void func(int i, int sum, ArrayList<Integer> arr, int n, ArrayList<Integer> sumSubset) {
        if (i == n) {
            sumSubset.add(sum);
            return;
        }
        // Include the current element
        func(i + 1, sum + arr.get(i), arr, n, sumSubset);
        // Exclude the current element
        func(i + 1, sum, arr, n, sumSubset);
    }

    // Wrapper function to return subset sums
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0, 0, arr, n, sumSubset);
        return sumSubset;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        ArrayList<Integer> result = subsetSums(arr, arr.size());

        // Sort the results for better readability
        Collections.sort(result);
        
        // Print the subset sums
        System.out.println("Subset Sums: " + result);
    }
}




////////returning unique sum//////////////////////

// import java.util.*;


// public class SubSum1 {
//     void func(int i,int sum,ArrayList<Integer> arr,int n,HashSet<Integer> sumSubset){
//         if(i==n){
//             sumSubset.add(sum);
//             return;
//         }
//         func(i+1,sum+arr.get(i),arr,n,sumSubset);
//         func(i+1,sum,arr,n,sumSubset);
//     }

//     HashSet<Integer> subsetSums(ArrayList<Integer> arr,int n){
//         HashSet<Integer> sumSubset = new HashSet<>();
//         func(0,0,arr,n,sumSubset);
//         return sumSubset;
//     }

//     public static void main(String[] args) {
//         SubSum1 s = new SubSum1();
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(1);
//         arr.add(2);
//         // arr.add(5);
//         // arr.add(6);

//         HashSet<Integer> result=s.subsetSums(arr,arr.size());
//         System.out.println(result);
//         }
// }
