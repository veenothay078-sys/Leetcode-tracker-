// Last updated: 7/9/2026, 11:48:41 AM
class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while(low < high) {
            int mid = (low + high) / 2;
            if(nums[mid] > nums[high])
                low = mid + 1;
            else if(nums[mid] == nums[high]) {
                high--;
            }
            else
                high = mid;
        }
        return nums[low];
    }
}