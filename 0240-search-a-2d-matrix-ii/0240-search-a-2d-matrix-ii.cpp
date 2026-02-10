class Solution {
public:
    bool BinarySearch(vector<vector<int>>& matrix, int target,int row,int col) {
        int sz = col;
        int st = 0;
        int end = sz;
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
        int row = 0;
        int col = col_sz - 1;
        while (col >= 0 && row < row_sz) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
                if (target >= matrix[row][0] && target <= matrix[row][col]) {
                    BinarySearch(matrix,target,row,col);
                }
                else{
                    row++;
                }
            } else if (matrix[row][col] < target) {
                row++;
            }
        }
        return false;
    }
};
