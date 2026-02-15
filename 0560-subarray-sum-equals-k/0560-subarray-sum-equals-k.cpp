class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> prefix_sum(n, 0);
        prefix_sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + nums[i];
        }
        unordered_map<int, int> m;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (prefix_sum[i] == k) {
                count++;
            }
            int val = prefix_sum[i] - k;
            if (m.find(val) != m.end()) {
                count += m[val];
            }
            if (m.find(prefix_sum[i]) == m.end()) {
                m[prefix_sum[i]] = 0;
            }
            m[prefix_sum[i]]++;
        }
        return count;
    }
};