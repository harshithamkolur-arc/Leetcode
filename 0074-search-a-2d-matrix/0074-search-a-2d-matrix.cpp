class Solution {
public:
    bool col_Search(vector<vector<int>>& matrix, int target,int row) {
        int sz = matrix[0].size();
        int st = 0;
        int end = sz - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row_sz = matrix.size();
        int col_sz = matrix[0].size();
        int st_row = 0;
        int end_row = row_sz - 1;
        while (st_row <= end_row) {
            int mid_row = st_row + ((end_row - st_row) / 2);
            if (matrix[mid_row][0] <= target &&
                target <= matrix[mid_row][col_sz - 1]) {
                return col_Search(matrix, target, mid_row);

            } else if (target >= matrix[mid_row][col_sz - 1]) {
                st_row = mid_row + 1;
            } else if (target < matrix[mid_row][0]) {
                end_row = mid_row - 1;
            }
        }
        return false;
    }
};