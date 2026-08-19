class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row_size = grid.length;
        int col_size = grid[0].length;
        int[] rowOnes = new int[row_size];
        int[] colOnes = new int[col_size];
        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j < col_size; j++) {
                if (grid[i][j] == 1) {
                    rowOnes[i]++;
                    colOnes[j]++;
                }
            }
        }

        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j < col_size; j++) {
                int rowZeros = col_size - rowOnes[i];
                int colZeros = row_size - colOnes[j];
                grid[i][j] = rowOnes[i] + colOnes[j] - rowZeros - colZeros;
            }
        }
        return grid;
    }
}