class Solution {
public:
    int permutationDiff(int s_freq[], int t_freq[]) {
        int diff = 0;
        for (int i = 0; i < 26; i++) {
            diff += abs(s_freq[i] - t_freq[i]);
        }
        return diff;
    }
    int findPermutationDifference(string s, string t) {
        int diff = 0;
        int len = s.length(); // or t.length() both the string length is same
        int s_freq[26] = {0};
        int t_freq[26] = {0};
        for (int i = 0; i < len; i++) {
            s_freq[s[i] - 'a'] = i;
            t_freq[t[i] - 'a'] = i;
        }
        return permutationDiff(s_freq, t_freq);
    }
};