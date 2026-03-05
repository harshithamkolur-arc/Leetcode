class Solution {
public:
    void combinations(string digits, string& combi, vector<string>& ans,
                      int idx) {
        if (idx == digits.size()) {
            ans.push_back(combi);
            return;
        }
        int num = digits[idx] - '0';
        int st = (num - 2) * 3;
        if (num > 7) {
            st++;
        }
        int end = st + 3;
        if (num == 7 || num == 9) {
            end = st + 4;
        }
        for (int i = st; i < end; i++) {
            char ch = 'a' + i;
            combi.push_back(ch);
            combinations(digits, combi, ans, idx + 1);
            combi.pop_back();
        }
    }
    vector<string> letterCombinations(string digits) {
        string combi;
        vector<string> ans;
        int idx = 0;
        combinations(digits, combi, ans, idx);
        return ans;
    }
};