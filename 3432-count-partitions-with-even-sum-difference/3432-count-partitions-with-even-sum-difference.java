class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for (int val : nums) {
            sum += val;
        }
        int currSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currSum += nums[i];
            if ((currSum - (sum - currSum)) % 2 == 0)
                count++;
        }
        return count;
    }
}