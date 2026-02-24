class Solution {
public:
    vector<int> game(vector<int>& nums, int i, int n, vector<int>& ans) {
        int idx = i + 1;
        if (i == n - 2) {
            ans.push_back(nums[idx]);
            ans.push_back(nums[idx - 1]);
            return ans;
        }
        ans.push_back(nums[idx]);
        ans.push_back(nums[idx - 1]);
        return game(nums, i + 2, n, ans);
    }
    vector<int> numberGame(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int n = nums.size();
        vector<int> ans;
        return game(nums, 0, n, ans);
    }
};