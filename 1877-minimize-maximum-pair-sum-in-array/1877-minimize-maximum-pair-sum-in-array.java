class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n / 2; i++) {
            int currSum = nums[i] + nums[n - 1 - i];
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}