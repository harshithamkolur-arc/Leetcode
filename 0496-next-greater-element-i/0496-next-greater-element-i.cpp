class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack<int> st;
        unordered_map<int,int> map;
        vector<int> ans;
        int n = nums2.size() - 1;
        for (int i = n; i >= 0; i--) {
            while(!st.empty() && st.top() <= nums2[i]){
                st.pop();
            }
            if(st.empty()){
                map[nums2[i]] = -1;
            }
            else{
                map[nums2[i]] = st.top();
            }
            st.push(nums2[i]);
        }
        for(int val: nums1){
            ans.push_back(map[val]);
        }
        return ans;
    }
};