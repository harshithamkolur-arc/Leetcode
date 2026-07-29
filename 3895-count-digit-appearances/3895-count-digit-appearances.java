class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for (int val : nums) {
            while (val != 0) {
                if (val % 10 == digit)
                    count++;
                val /= 10;
            }
        }
        return count;
    }
}