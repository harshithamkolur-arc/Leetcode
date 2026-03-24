class Solution {
public:
    vector<vector<int>> reverseSubmatrix(vector<vector<int>>& grid, int x,
                                         int y, int k) {
        int r_sz = x + k - 1;
        int c_sz = y + k - 1;
        while (x < r_sz) {
            for (int i = y; i <= c_sz; i++) {
                swap(grid[x][i],grid[r_sz][i]);
            }
            x++;
            r_sz--;
        }
        return grid;
    }
};