// Last updated: 7/9/2026, 12:28:48 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) 
        return 0;

        int i = 1;

        for (int j = 1; j < nums.length; j++) 
        {
            if (nums[j] != nums[i - 1]) 
            {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;        
    }
}















// class Solution 
// {
//     public int removeDuplicates(int[] nums) 
//     {
        
//         int nums=sc.nextInt();
//         int arr[]=new int[nums];
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     System.out.print(arr[i]);
//                 }
//             }
//         }
//     }           
    
// }