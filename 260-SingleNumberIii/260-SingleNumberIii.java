// Last updated: 7/9/2026, 11:46:39 AM
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        // XOR of all elements
        for (int num : nums) {
            xor ^= num;
        }

        // Rightmost set bit
        int diffBit = xor & (-xor);

        int num1 = 0, num2 = 0;

        // Divide numbers into two groups
        for (int num : nums) {
            if ((num & diffBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        return new int[]{num1, num2};
    }
}