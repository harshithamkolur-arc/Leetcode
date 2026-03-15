class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        unordered_map<int,int>map;
        vector<int> ans;
        for(int val: nums){
            if(map.find(val) == map.end()){
                map[val] = 1;
            }
            else{
                ans.push_back(val);
            }
        }
    return ans;
    }
};