class Solution {
public:
    void solve(int k, int n, vector<int>& combi, vector<vector<int>>& ans,
               int start) {
        if (n == 0 && combi.size() == k) {
            ans.push_back({combi});
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (n - i < 0) {
                break;
            }
            combi.push_back(i);
            solve(k, n - i, combi, ans, i+1);
            combi.pop_back();
        }
    }
    vector<vector<int>> combinationSum3(int k, int n) {
        vector<int> combi;
        vector<vector<int>> ans;
        solve(k, n, combi, ans, 1);
        return ans;
    }
};