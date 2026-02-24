class Solution {
public:
    vector<int> game(vector<int>& nums, int i, int n) {
        if (i == n - 2) {
            swap(nums[i],nums[i+1]);
            return nums;
        }
        swap(nums[i],nums[i+1]);
        return game(nums, i + 2, n);
    }
    vector<int> numberGame(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int n = nums.size();
        return game(nums, 0, n);
    }
};