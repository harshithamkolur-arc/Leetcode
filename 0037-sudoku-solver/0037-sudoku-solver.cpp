class Solution {
public:
    bool isSafe(vector<vector<char>>& board, int row, int col, char num) {
        int n = board.size();
        for (int i = 0; i < n; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        for (int i = 0; i < n; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }
        int subBox = sqrt(n);
        int r = row - (row % subBox);
        int c = col - (col % subBox);
        for (int i = r; i < r + subBox; i++) {
            for (int j = c; j < c + subBox; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    bool solve(vector<vector<char>>& board, int row, int col) {
        int n = board.size();
        if (row == n) {
            return true;
        }
        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == n) {
            nextRow = nextRow + 1;
            nextCol = 0;
        }
        if (board[row][col] != '.') {
            return solve(board, nextRow, nextCol);
        }
        for (int i = 1; i <= n; i++) {
            char num = i + '0';
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (solve(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    void solveSudoku(vector<vector<char>>& board) 
    { solve(board, 0, 0); }
};