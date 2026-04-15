class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        int n = heights.size();
        stack<int> nxt_st;
        stack<int> prev_st;
        vector<int> nxt_small(n);
        vector<int> prev_small(n);
        for (int i = n - 1; i >= 0; i--) {
            while (nxt_st.size() > 0 && heights[nxt_st.top()] >= heights[i]) {
                nxt_st.pop();
            }
            nxt_small[i] = nxt_st.empty() ? n : nxt_st.top();
            nxt_st.push(i);
        }
        for (int i = 0; i < n; i++) {
            while (prev_st.size() > 0 && heights[prev_st.top()] >= heights[i]) {
                prev_st.pop();
            }
            prev_small[i] = prev_st.empty() ? -1 : prev_st.top();
            prev_st.push(i);
        }
        int area = 0;
        for (int i = 0; i < n; i++) {
            int width = nxt_small[i] - prev_small[i] - 1;
            area = max(area, heights[i] * width);
        }
        return area;
    }
};