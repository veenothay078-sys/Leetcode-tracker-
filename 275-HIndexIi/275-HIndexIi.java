// Last updated: 7/9/2026, 11:46:34 AM
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int h = n - mid;

            if (citations[mid] >= h) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return n - left;
    }
}