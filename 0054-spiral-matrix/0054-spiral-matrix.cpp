class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int st_row = 0;
        int st_col = 0;
        int end_row = matrix.size() - 1;
        int end_col = matrix[0].size() - 1;
        vector<int> ans;
        while(st_row<=end_row && st_col<=end_col){
            for(int i = st_col;i<=end_col;i++){
                ans.push_back(matrix[st_row][i]);
            }
            for(int i = st_row+1;i<=end_row;i++){
                ans.push_back(matrix[i][end_col]);
            }
            for(int i = end_col-1;i>=st_col;i--){
                if(st_row==end_row){
                    break;
                }
                ans.push_back(matrix[end_row][i]);
            }
            for(int i = end_row-1;i>=st_row+1;i--){
                if(st_col==end_col){
                    break;
                }
                ans.push_back(matrix[i][st_col]);
            }
            st_row++;st_col++;end_row--;end_col--;
    }
    return ans;
    }
};