class Solution {
public:
    bool isPalindrome(string s) {
        int st = 0;
        int end = s.length() - 1;
        while (st < end) {
            if(!iswalnum(s[st])){
                st++;
                continue;
            }
            else if(!iswalnum(s[end])){
                end--;
                continue;
            }
            if (tolower(s[st]) == tolower(s[end])) {
                st++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
};