class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            int val = 0;
            for (int j = 0; j < col; j++) {
                val += accounts[i][j];
            }
            sum = Math.max(sum, val);
        }
        return sum;
    }
}