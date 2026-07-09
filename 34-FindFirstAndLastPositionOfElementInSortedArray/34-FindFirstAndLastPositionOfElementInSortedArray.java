// Last updated: 7/9/2026, 12:28:34 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int n = nums.length;
        int right = n-1;
        int left = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                first = mid;
                right = mid-1;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        left = 0;
        right = n-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                last = mid;
                left = mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return new int[]{first,last};
        
    }
}