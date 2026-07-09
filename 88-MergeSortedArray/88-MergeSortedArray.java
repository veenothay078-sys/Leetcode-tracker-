// Last updated: 7/9/2026, 12:26:49 PM
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int p1 = m-1 , p2 = n-1 ,i = m+n-1;
//         while(p2 >=0 ){
//             if(p1 >=0 && nums1[p1] > nums2[p2]){
//                 nums1[i--] = nums1[p1--];
//             } 
//             else{
//                 nums1[i--] = nums2[p2--];
//             }
//         }
//        }
// }


import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}