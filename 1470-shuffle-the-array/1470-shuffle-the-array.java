class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int currX = 0;
        int currY = n;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[currX];
                currX++;
            } else {
                ans[i] = nums[currY];
                currY++;
            }
        }
        return ans;
    }
}