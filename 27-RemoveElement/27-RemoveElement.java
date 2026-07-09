// Last updated: 7/9/2026, 12:28:46 PM
public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int num : nums) if (num != val) nums[k++] = num;
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 2, 3};
        int k = solution.removeElement(nums, 3);
        System.out.println(k); // Output: 2
    }
}