class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector<int> ans;
        unordered_map<int,int> map;
        vector<int> sortedArr = nums;
        sort(sortedArr.begin(),sortedArr.end());
        for(int i=0;i<sortedArr.size();i++){
            if(map.find(sortedArr[i]) == map.end()){
                map[sortedArr[i]] = i;
            }
        }  
        for(int i=0;i<nums.size();i++){
            ans.push_back(map[nums[i]]);
        }
        return ans;
    }
};