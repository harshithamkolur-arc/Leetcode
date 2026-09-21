class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long func = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            func += (nums[i] * i);
            sum += nums[i];
        }
        long func_max = func;
        for (int i = n - 1; i > 0; i--) {
            func = func + sum - (n * nums[i]);
            func_max = Math.max(func, func_max);
        }
        return (int)func_max;
    }
}