class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        int inc = 0; 
        while(inc < n){
            int i = 0;
            while(i < n - 1 - inc){
                nums[i] = (nums[i] + nums[i+1]) % 10;
                i++;
            }
            inc++;
        }
        return nums[0] % 10;
    }
}