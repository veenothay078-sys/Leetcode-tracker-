// Last updated: 7/9/2026, 12:28:11 PM
import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Step 1: Sort to handle duplicates
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), result, used);
        return result;
    }

    static void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> result, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Step 2: Skip used elements
            if (used[i]) continue;

            // Step 3: Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            tempList.add(nums[i]);
            used[i] = true;

            backtrack(nums, tempList, result, used);

            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}
