class Solution {
public:
    void Rec_sub(vector<int>& nums, vector<int>& subset,
                 vector<vector<int>>& ans, int i) {
        int n = nums.size();
        if (i == n) {
            ans.push_back({subset});
            return;
        }
        subset.push_back(nums[i]);
        Rec_sub(nums, subset, ans, i + 1);
        subset.pop_back();
        Rec_sub(nums, subset, ans, i + 1);
    }
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<int> subset;
        vector<vector<int>> ans;
        Rec_sub(nums, subset, ans, 0);
        return ans;
    }
};