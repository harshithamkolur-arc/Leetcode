class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            int ind = i;
            while (ind != 0) {
                if (ind % 2 == 1)
                    count++;
                ind /= 2;
            }
            if (count == k)
                sum += nums.get(i);
        }
        return sum;
    }
}