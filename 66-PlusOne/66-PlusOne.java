// Last updated: 7/9/2026, 12:27:37 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the end (least significant digit)
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, just add 1 and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, set it to 0 and continue loop to handle carry
            digits[i] = 0;
        }

        // If all digits were 9 (e.g., 999), we need a new array with one extra digit
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // rest are already 0 by default
        return newNumber;
    }
}