class Solution {
public:
    string removeOuterParentheses(string s) {
        vector<char> stack;
        string ans = "";
        for(char ch: s){
            if(ch == '('){
                if(!stack.empty()) ans += ch;
                stack.push_back(ch);
            }
            else{
                stack.pop_back();
                if(!stack.empty()) ans +=ch;
            }
        }
        return ans;
    }
};