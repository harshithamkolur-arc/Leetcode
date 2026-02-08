class Solution {
public:
    int balancedStringSplit(string s) {
        int ans = 0;
        int count_R = 0;
        int count_L = 0;
        int j = 0;
        while (j < s.length()) {
            if (s[j] == 'R') {
                count_R++;
                j++;
            } else {
                count_L++;
                j++;
            }
            if (count_R == count_L) {
                ans++;
                count_R = 0;
                count_L = 0;
            }
        }
        return ans;
    }
};