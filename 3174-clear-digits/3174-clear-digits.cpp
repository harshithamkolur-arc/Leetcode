class Solution {
public:
    string clearDigits(string s) {
        string st;
        for(char ch: s){
            if((int)ch >= 65){
                st.push_back(ch);
            }
            else{
                st.pop_back();
            }
        }
        return st;
    }
};