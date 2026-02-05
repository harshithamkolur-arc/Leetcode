class Solution {
public:
    int reverseDegree(string s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int rev_idx = ('z' - s[i]) + 1;
            cout<<i+1<<" "<<rev_idx<<endl;
            sum += (i+1) * rev_idx;
        }
        return sum;
    }
};