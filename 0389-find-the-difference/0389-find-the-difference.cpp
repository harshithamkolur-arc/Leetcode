class Solution {
public:
    char findTheDifference(string s, string t) {
        /* Use XOR of optimal solution
        unordered_map<char, int> freq;
        for (char c : s) {
            freq[c]++;
        }
        for (char c : t) {
            freq[c]--;
            if (freq[c] < 0) {
                return c;
            }
        }
        return ' ';*/

        int result = 0;
        for (int i = 0; i < s.size(); i++) {
            result ^= s[i];
        }
        for (int i = 0; i < t.size(); i++) {
            result ^= t[i];
        }
        return result;
    }
};