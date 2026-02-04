class Solution {
public:
    bool freqCompare(int s1_freq[], int win_freq[]) {
        for (int i = 0; i < 26; i++) {
            if (s1_freq[i] != win_freq[i]) {
                return false;
            }
        }
        return true;
    }
    bool checkInclusion(string s1, string s2) {
        int s1_freq[26] = {0};
        for (int i = 0; i < s1.length(); i++) {
            s1_freq[s1[i] - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            int win_freq[26] = {0};
            int win_sz = s1.length();
            int win_idx = 0;
            int idx = i;
            while (win_idx < win_sz && idx < s2.length()) {
                win_freq[s2[idx] - 'a']++;
                win_idx++;
                idx++;
            }
            cout<<freqCompare(s1_freq, win_freq)<<endl;
            if (freqCompare(s1_freq, win_freq)) {
                return true;
            }
        }
        return false;
    }
};