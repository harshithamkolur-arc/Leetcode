class Solution {
public:
    vector<string> buildArray(vector<int>& target, int n) {
        vector<string> st;
        int tarsz = target.size();
        int i = 1;
        int j = 0;
        while (j < tarsz) {
            st.push_back("Push");
            if (i == target[j]) {
                j++;
            } else {
                st.push_back("Pop");
            }
            i++;
        }
        return st;
    }
};