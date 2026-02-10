class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row_sz = matrix.size();
        int col_sz = matrix[0].size();
        int row = 0;
        int col = col_sz - 1;
        while (col >= 0 && row < row_sz) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            }
        }
        return false;
    }
};

