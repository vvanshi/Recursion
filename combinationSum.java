///PRINT ALL THE UNIQUE COMBINATIONS WHOSE SUM IS TARGET///////////////////


import java.util.*;


public class combinationSum{
    public static void allcombinations(int i,int arr[],int target,ArrayList<ArrayList<Integer>> all,ArrayList<Integer> cur){
               if(target==0){
                all.add(new ArrayList<>(cur));
               return ;
        }

          if(i==arr.length || target<0) return;

          if(arr[i]<=target){
            cur.add(arr[i]);
            allcombinations(i, arr, target-arr[i], all, cur);
            cur.remove(cur.size()-1);
          }
             allcombinations(i+1, arr, target, all, cur);//excluded
    }

    public static ArrayList<ArrayList<Integer>> combination(int arr[],int target)
        {
        ArrayList<ArrayList<Integer>> all=new ArrayList<>();
       
        allcombinations(0,arr,target,all,new ArrayList<>());
        return all;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int target=5;
        ArrayList<ArrayList<Integer>> result = combination(arr, target);
        for (ArrayList<Integer> v : result) {
          System.out.println(v);
        }
    }
}

