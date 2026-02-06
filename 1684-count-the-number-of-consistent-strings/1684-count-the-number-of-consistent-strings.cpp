class Solution {
public:
    bool compareFreq(int allowed_freq[], int words_freq[]) {
        for (int i = 0; i < 26; i++) {
            if (allowed_freq[i] == 0 && words_freq[i] == 1) {
                return false;
            }
        }
        return true;
    }
    int countConsistentStrings(string allowed, vector<string>& words) {
        int allowed_freq[26] = {0};
        int count = 0;
        for (int i = 0; i < allowed.length(); i++) {
            allowed_freq[allowed[i] - 'a'] = 1;
        }
        for (int i = 0; i < words.size(); i++) {
            int words_freq[26] = {0};
            for (int j = 0; j < words[i].length(); j++) {
                words_freq[words[i][j] - 'a'] = 1;
                if (words_freq[words[i][j] - 'a'] !=
                    allowed_freq[words[i][j] - 'a']) {
                    break;
                }
            }
            if (compareFreq(allowed_freq,words_freq)) {
                count++;
            }
        }
        return count;
    }
};