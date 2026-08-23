class Solution {
    public double minimumAverage(int[] nums) {
        double min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            double average = (double) (nums[i] + nums[nums.length - 1 - i]) / 2;
            min = Math.min(min, average);
        }
        return min;
    }
}