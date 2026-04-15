class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        int n = heights.size();
        stack<int> st;
        vector<int> nxt_small(n);
        vector<int> prev_small(n);
        for (int i = n - 1; i >= 0; i--) {
            while (st.size() > 0 && heights[st.top()] >= heights[i]) {
                st.pop();
            }
            nxt_small[i] = st.empty() ? n : st.top();
            st.push(i);
        }
        while (!st.empty()) {
            st.pop();
        }
        for (int i = 0; i < n; i++) {
            while (st.size() > 0 && heights[st.top()] >= heights[i]) {
                st.pop();
            }
            prev_small[i] = st.empty() ? -1 : st.top();
            st.push(i);
        }
        int area = 0;
        for (int i = 0; i < n; i++) {
            int width = nxt_small[i] - prev_small[i] - 1;
            area = max(area, heights[i] * width);
        }
        return area;
    }
};