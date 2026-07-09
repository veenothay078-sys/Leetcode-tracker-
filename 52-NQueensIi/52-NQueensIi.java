// Last updated: 7/9/2026, 12:28:01 PM
class Solution {
    int grid[][];
    public int totalNQueens(int n) {
        grid = new int[n][n];
        
        return helper(n,0);
    }

    private int helper(int n,int r){
        if(r == n)
            return 1;

        int ans = 0;

        for(int c=0;c<n;c++){
            if(grid[r][c] == 0){
                update(n,r,c,1);
                ans += helper(n,r+1);
                update(n,r,c,-1);
            }
        }

        return ans;
    }

    private void update(int n,int r,int c,int dif){
        int[] dr = {-1, -1, 1, 1};
        int[] dc = {-1,  1, 1, -1};

        for(int i=0;i<n;i++){
            grid[i][c] += dif;
            grid[r][i] += dif;
        }

        for (int d = 0; d < 4; d++) {
            int newR = r + dr[d];
            int newC = c + dc[d];
            while (newR >= 0 && newR < n && newC >= 0 && newC < n) {
                grid[newR][newC] += dif;
                newR += dr[d];
                newC += dc[d];
            }
        }
    }
}