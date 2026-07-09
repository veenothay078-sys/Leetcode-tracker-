// Last updated: 7/9/2026, 11:59:37 AM
class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length == 0) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        for(int i =0; i < rows; i++) {
            for(int j =0; j < cols; j++) {
                // run dfs on edges - mark them 'V' as visited
                if(i == 0 || j == 0 || i == rows - 1 || j == cols - 1 && board[i][j] == 'O') {
                    dfs(i,j,board);
                }
            }
        }

        // check all cells to flip into 'X'
        for(int i =0; i < rows; i++) {
            for(int j =0; j < cols; j++) {
                if(board[i][j] == 'O') {
                      board[i][j] = 'X';
                }
                else if(board[i][j] == 'V') {
                    board[i][j] = 'O';
                }
            }
        }
    }


    // dfs on border cells
    public void dfs(int i, int j, char[][] board) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }

        // mark as visited
        board[i][j] = 'V';

        // rest of border cells
        dfs(i + 1, j, board); // up
        dfs(i - 1, j, board); // down
        dfs(i, j + 1, board); // right
        dfs(i, j - 1, board); // left
    }
}