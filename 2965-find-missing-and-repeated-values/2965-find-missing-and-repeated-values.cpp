class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        vector<int> ans;
        unordered_set<int> s;
        int grid_sum = 0, req_sum = 0;
        int a, b;
        int n = grid.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid_sum += grid[i][j];
                if (s.find(grid[i][j]) != s.end()) {
                    a = grid[i][j];
                    ans.push_back(a);
                }
                s.insert(grid[i][j]);
            }
        }
        req_sum = (n * n) * (n * n + 1) / 2;
        b = req_sum - grid_sum + a;
        ans.push_back(b);
        return ans;
    }
};