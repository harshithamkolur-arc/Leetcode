class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];
        leftSum[0] = 0;
        rightSum[len - 1] = 0;
        for (int i = 1; i <= len - 1; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }
        for (int i = len - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }
        for (int i = 0; i <= len - 1; i++) {
            leftSum[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return leftSum;
    }
}