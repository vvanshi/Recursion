import java.util.*;

class Solution {

    public void subsetSum2(int ind, int[] arr, List<List<Integer>> ans, List<Integer> ds) {
        ans.add(new ArrayList<>(ds));  // Add current subset to the answer list
        
        for (int i = ind; i < arr.length; i++) {
            if (i != ind && arr[i] == arr[i - 1]) continue;  // Skip duplicates
            
            ds.add(arr[i]);  // Include current element
            subsetSum2(i + 1, arr, ans, ds);
            ds.remove(ds.size() - 1);  // Backtrack
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);  // Sort to handle duplicates
        List<List<Integer>> ans = new ArrayList<>();
        subsetSum2(0, nums, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 2};  // Example input with duplicates

        List<List<Integer>> result = solution.subsetsWithDup(nums);
        System.out.println("Unique subsets: " + result);
    }
}
