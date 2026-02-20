class Solution {
public:
    void calSubsets(vector<int>& nums, vector<int> &subset, int i, vector<vector<int>> &ans) {
        int n = nums.size();
        if (i == n) {
            ans.push_back({subset});
            return;
        }
        subset.push_back(nums[i]);
        calSubsets(nums, subset, i + 1, ans);
        subset.pop_back();
        int idx = i + 1;
        while (idx < n && nums[idx] == nums[idx-1]) {
            idx++;
        }
        calSubsets(nums, subset, idx, ans);
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<int> subset;
        vector<vector<int>> ans;
        calSubsets(nums, subset, 0, ans);
        return ans;
    }
};