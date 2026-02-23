class Solution {
public:
    vector<int> concat(vector<int>& nums, int idx, int n, vector<int>& ans) {
        if (idx == n) {
            return ans;
        }
        ans[idx] = nums[idx];
        ans[n + idx] = nums[idx];
        return concat(nums, idx + 1, n, ans);
    }
    vector<int> getConcatenation(vector<int>& nums) {
        int n = nums.size();
        int sz = 2 * n;
        vector<int> ans(sz);
        return concat(nums, 0, n, ans);
    }
};