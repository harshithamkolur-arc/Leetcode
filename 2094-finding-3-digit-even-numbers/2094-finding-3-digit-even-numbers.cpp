class Solution {
public:
    void evenNum(vector<int>& digits, int& num, vector<int>& ans, int depth,
                 vector<bool> &used) {
        if (depth == 3) {
            ans.push_back(num);
            return;
        }
        for (int i = 0; i < digits.size(); i++) {
            if (used[i] == true)
                continue;
            if (digits[i] == 0 && depth == 0) {
                continue;
            } else if (depth == 2 && digits[i] % 2 != 0) {
                continue;
            }
            used[i] = true;
            num = (num * 10) + digits[i];
            evenNum(digits, num, ans, depth + 1, used);
            num = (num / 10);
            used[i] = false;
        }
    }
    vector<int> findEvenNumbers(vector<int>& digits) {
        int num = 0;
        vector<int> ans;
        int depth = 0;
        vector<bool> used(digits.size(), false);
        evenNum(digits, num, ans, depth, used);
        sort(ans.begin(), ans.end());
        ans.erase(unique(ans.begin(), ans.end()), ans.end());
        return ans;
    }
};