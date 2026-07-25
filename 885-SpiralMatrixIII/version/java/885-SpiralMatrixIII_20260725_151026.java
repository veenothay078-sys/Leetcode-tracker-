// Last updated: 7/25/2026, 3:10:26 PM
1class Solution {
2    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
3        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // East, South, West, North
4        int[][] result = new int[rows * cols][2];
5        int steps = 0, d = 0, len = 0;
6        
7        result[0] = new int[]{rStart, cStart};
8        int count = 1;
9        
10        while (count < rows * cols) {
11            if (d == 0 || d == 2) steps++; // Increase step size after moving East or West
12            
13            for (int i = 0; i < steps; i++) {
14                rStart += directions[d][0];
15                cStart += directions[d][1];
16                
17                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
18                    result[count++] = new int[]{rStart, cStart};
19                }
20                
21                if (count == rows * cols) return result;
22            }
23            
24            d = (d + 1) % 4; // Change direction
25        }
26        
27        return result;
28    }
29}