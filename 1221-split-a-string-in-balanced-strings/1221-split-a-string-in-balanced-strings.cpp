class Solution {
public:
    int balancedStringSplit(string s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int count_R = 0;
            int count_L = 0;
            int win_idx = i;
            while (win_idx < s.length()) {
                if (s[win_idx] == 'R') {
                    count_R++;
                    win_idx++;
                    i++;
                } else {
                    count_L++;
                    win_idx++;
                    i++;
                }
                if (count_R == count_L) {
                    ans++;
                }
            }
        }

        return ans;
    }
};