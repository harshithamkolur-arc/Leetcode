class Solution {
public:
    void arrange(vector<string>& names, vector<int>& heights, int idx, int n) {
        if (n == 0) {
            return;
        }
        if (idx < n) {
            if (heights[idx] < heights[idx + 1]) {
                swap(heights[idx], heights[idx + 1]);
                swap(names[idx], names[idx + 1]);
            }
            arrange(names, heights, idx + 1, n);
        } else {
            arrange(names, heights, 0, n - 1);
        }
    }
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        int n = names.size() - 1;
        arrange(names, heights, 0, n);
        return names;
    }
};