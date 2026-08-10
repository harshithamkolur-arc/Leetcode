class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans = 0;
        for (int val : nums) {
            if (val % 2 == 0)
                ans = ans | val;
        }
        return ans;
    }
}