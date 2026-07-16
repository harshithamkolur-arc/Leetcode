class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int sum = nums[0];
        int ans = 0;
        for(int i=1;i<nums.size();i++){
            sum += nums[i];
        }
        if(sum < k){
            ans = sum;
        }
        else if(sum % k != 0){
           ans = sum%k;
        }
        return ans;
    }
};