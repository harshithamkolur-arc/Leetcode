class Solution {
    public int differenceOfSum(int[] nums) {
        int Ele_sum = 0;
        int dig_sun = 0;
        for (int val : nums) {
            Ele_sum += val;
            while (val != 0) {
                dig_sun += val % 10;
                val /= 10;
            }
        }
        return Math.abs(Ele_sum - dig_sun);
    }
}