class Solution {
public:
    void solve(vector<int>& candidates, int target, vector<int>& combi,
               vector<vector<int>>& ans, int idx) {
        int n = candidates.size();
        if (target == 0) {
            ans.push_back({combi});
        }
        for (int i = idx; i < n; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                continue;
            }
            combi.push_back(candidates[i]);
            solve(candidates, target - candidates[i], combi, ans, i + 1);
            combi.pop_back();
        }
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        vector<int> combi;
        vector<vector<int>> ans;
        sort(candidates.begin(), candidates.end());
        solve(candidates, target, combi, ans, 0);
        return ans;
    }
};