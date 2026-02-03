class Solution {
public:
    string reverseWords(string s) {
        reverse(s.begin(), s.end());
        string ans = "";
        for (int i = 0; i < s.length(); i++) {
            string word = "";
            while (i < s.length() && s[i] != ' ') {
                word += s[i];
                i++;
            }
            reverse(word.begin(), word.end());
            if (word.length() > 0) { /* without this condition extra space will be added if valid word is not found as empty string(word) will be added with space*/
                ans += " " + word;
            }
        }
        return ans.substr(1);
    }
};