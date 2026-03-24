class Solution {
public:
    int numberOfPairs(vector<int>& nums1, vector<int>& nums2, int k) {
        int count = 0;
        for(int i=0;i<nums1.size();i++){
            if(nums1[i]%k !=0) continue;
            int num = nums1[i] / k;
            for(int j=0;j<nums2.size();j++){
                if(num % nums2[j] == 0){
                    count++;
                }
            }
        }
        return count;
    }
};
