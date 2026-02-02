class Solution {
public:
    string reversePrefix(string s, int k) {
        int idx = s.length() - k;
        reverse(s.begin(),s.end()-idx);
        return s;
    }
};