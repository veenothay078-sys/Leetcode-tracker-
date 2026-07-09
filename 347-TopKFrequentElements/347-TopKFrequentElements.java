// Last updated: 7/9/2026, 11:46:12 AM
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int element = 0;

            for (int key : map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    element = key;
                }
            }

            ans[i] = element;
            map.remove(element);
        }

        return ans;
    }
}