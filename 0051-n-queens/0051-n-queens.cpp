class Solution {
public:
    bool isSafe(vector<string>& board, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        int rightBound = min(row,col);
        for (int i = 1; i <= rightBound; i++) {
            if (board[row - i][col - i] == 'Q') {
                return false;
            }
        }
        int leftBound = min(row,n - col - 1);
        for (int i = 0; i <= leftBound; i++) {
            if (board[row - i][col + i] == 'Q') {
                return false;
            }
        }
        return true;
    }
    void arrangeQueen(vector<string>& board, int row, int n,
                      vector<vector<string>>& ans) {
        if (row == n) {
            ans.push_back({board});
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, row, i, n)) {
                board[row][i] = 'Q';
                arrangeQueen(board, row + 1, n, ans);
                board[row][i] = '.';
            }
        }
    }
    vector<vector<string>> solveNQueens(int n) {
        vector<string> board(n,string(n,'.'));
        vector<vector<string>> ans;
        arrangeQueen(board, 0, n, ans);
        return ans;
    }
};