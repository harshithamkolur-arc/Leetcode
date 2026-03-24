class Solution {
public:
    bool findRotation(vector<vector<int>>& mat, vector<vector<int>>& target) {
        int rsz = mat.size();
        int csz = mat[0].size();
        vector<vector<int>> ans(rsz, vector<int>(csz));
        int count = 0;
        while (count <= 3) {
            for (int i = 0; i < rsz; i++) {
                for (int j = 0; j < csz; j++) {
                    ans[i][j] = mat[rsz - j - 1][i];
                }
            }
            if (ans == target) {
                return true;
            }
            count++;
            mat = ans;
        }
        return false;
    }
};