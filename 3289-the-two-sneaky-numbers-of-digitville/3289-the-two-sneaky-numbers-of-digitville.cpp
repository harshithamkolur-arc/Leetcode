class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        unordered_set<int>set;
        vector<int> ans;
        for(int val: nums){
            if(set.find(val) == set.end()){
                set.insert(val);
            }
            else{
                ans.push_back(val);
            }
        }
    return ans;
    }
};