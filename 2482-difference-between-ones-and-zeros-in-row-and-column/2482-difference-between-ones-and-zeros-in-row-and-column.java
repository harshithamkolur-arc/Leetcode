class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row_size = grid.length;
        int col_size = grid[0].length;
        int[] rowOnes = new int[row_size];
        int[] colOnes = new int[col_size];
        int[] rowZeros = new int[row_size];
        int[] colZeros = new int[col_size];
        for (int i = 0; i < row_size; i++) {
            int ones = 0;
            for (int j = 0; j < col_size; j++) {
                if (grid[i][j] == 1)
                    ones++;
            }
            rowOnes[i] = ones;
            rowZeros[i] = col_size - ones;
        }
        for (int i = 0; i < col_size; i++) {
            int ones = 0;
            for (int j = 0; j < row_size; j++) {
                if (grid[j][i] == 1)
                    ones++;
            }
            colOnes[i] = ones;
            colZeros[i] = row_size - ones;
        }
        
        for(int i=0;i<row_size;i++){
            System.out.println(rowOnes[i] +" "+ rowZeros[i]);
        }/*
        System.out.println(".......");
        for(int i=0;i<col_size;i++){
            System.out.println(colZeros[i]);
        }*/
        for(int i=0;i<row_size;i++){
            for(int j=0;j<col_size;j++){
                //System.out.println(rowOnes[i] +" "+ colOnes[j] +" "+ rowZeros[i] +" "+ colZeros[j]);
                grid[i][j] = rowOnes[i] + colOnes[j] - rowZeros[i] - colZeros[j];
            }
        }
        return grid;
    }
}