class Solution {
public:
    int maxDepth(string s) {
        int max_val = 0;
        stack<char> st;
        for(int i=0;i<s.size();i++){
            if(s[i]=='('){
                st.push(s[i]);
            }
            else if(s[i]==')'){
                max_val = max(max_val,(int)st.size());
                st.pop();
            }
        }
        return max_val;
    }
};