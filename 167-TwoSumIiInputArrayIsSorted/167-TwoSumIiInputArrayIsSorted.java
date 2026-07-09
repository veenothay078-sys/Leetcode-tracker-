// Last updated: 7/9/2026, 11:48:29 AM
class Solution {
        // time :O(n), n = numbers of elemnts to loop through
        // space:O(1)
 
    public int[] twoSum(int[] numbers, int target) {

        //       i       j
        // arr = 2 7 11 15      target = 9

        // sum > target , decrement larger number
        // sum < target , increment smaller number

        int i = 0;
        int j = numbers.length - 1;

        while(i < j) {
            int sum = numbers[i] + numbers[j];
            if(sum == target) return new int[]{i + 1, j + 1};
            else if(sum > target) j--;
            else i++;
        }

        return new int[]{-1, -1};
    }
}