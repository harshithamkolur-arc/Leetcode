class Solution {
public:
    string reversePrefix(string word, char ch) {
        int n = word.size();
        int idx = word.find(ch);
        stack<int> st;
        if (idx < n) {
            for (int i = 0; i <= idx; i++) {
                st.push(word[i]);
            }
            for (int i = 0; i <= idx; i++) {
                word[i] = st.top();
                st.pop();
            }
        }
        return word;
    }
};