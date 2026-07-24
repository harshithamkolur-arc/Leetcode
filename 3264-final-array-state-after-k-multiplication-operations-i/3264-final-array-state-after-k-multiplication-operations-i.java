class Solution {
    public int minimum(int[] nums) {
        int min_val = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min_val) {
                min_val = nums[i];
                idx = i;
            }
        }
        return idx;
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k != 0) {
            int minIdx = minimum(nums);
            nums[minIdx] = nums[minIdx] * multiplier;
            k--;
        }
        return nums;
    }
}