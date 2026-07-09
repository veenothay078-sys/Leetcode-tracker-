// Last updated: 7/9/2026, 11:47:02 AM
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(k, n, 1, new ArrayList<>());
        return ans;
    }

    void backtrack(int k, int n, int start, List<Integer> list) {

        if (list.size() == k && n == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= 9; i++) {

            if (i > n) break;

            list.add(i);

            backtrack(k, n - i, i + 1, list);

            list.remove(list.size() - 1);
        }
    }
}