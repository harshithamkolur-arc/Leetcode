class Solution {
    public int findGCD(int[] nums) {
        int min_num = Integer.MAX_VALUE;
        int max_num = Integer.MIN_VALUE;
        for (int val : nums) {
            if (val < min_num)
                min_num = val;
            if (val > max_num)
                max_num = val;
        }
        int a = min_num;
        int b = max_num;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}