// Last updated: 7/9/2026, 11:41:48 AM
class Solution {
    public int[] sortArray(int[] nums) {
        int l=nums.length;
        if(l==1)
         return nums;

        int mid=l/2;
        int[] left=Arrays.copyOfRange(nums,0,mid);
        int[] right=Arrays.copyOfRange(nums,mid,l);
        int[]a=sortArray(left);
        int[]b=sortArray(right);
        int sort[]=new int[l];
        int i=0;int j=0;int k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                sort[k]=a[i];
                i++;
                k++;
            }
            else
            {
                sort[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length)
        {
            sort[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length)
        {
            sort[k]=b[j];
            j++;
            k++;
        }
        return sort;
    }
}