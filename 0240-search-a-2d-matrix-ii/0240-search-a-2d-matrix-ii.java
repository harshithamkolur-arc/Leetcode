class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n_row=matrix.length;
        int n_col=matrix[0].length;
        for(int i=0;i<n_row;i++){
            if(matrix[i][0]<=target && matrix[i][n_col-1]>=target){
                for(int j:matrix[i]){
                    if(j==target)return true;
                }
            }
        }
        return false;
    }
}