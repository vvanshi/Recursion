////////////PRINT ALL THE UNIQUE COMBINATIONS HAVING ALL THE ELEMENTS OCCURENCES ONLY 1 TIME WITH SUM TARGET/////////

import java.util.*;
public class combSum2{

public static void combinations(int ind,int arr[],int target,List<List<Integer>> ans,List<Integer> ds){
    if(target==0){
        ans.add(new ArrayList<>(ds));
        return;
    }
    for(int i=ind;i<arr.length;i++){
        if(i>ind && arr[i]==arr[i-1]) continue;
        if(arr[i]>target) break;
        ds.add(arr[i]);
        combinations(i+1, arr, target-arr[i], ans, ds);
        ds.remove(ds.size()-1);
    }
}

public static List<List<Integer>> findcomb(int arr[],int target){
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(arr);
    combinations(0,arr,target,ans,new ArrayList<>());
    return ans;
}

    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> result = findcomb(arr, target);
        for (List<Integer> v : result) {
          System.out.println(v);

    }
    }
}