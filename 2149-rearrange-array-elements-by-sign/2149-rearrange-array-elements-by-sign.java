class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos_arr = new ArrayList<>();
        List<Integer> neg_arr = new ArrayList<>();
        for (int val : nums) {
            if (val >= 0)
                pos_arr.add(val);
            else
                neg_arr.add(val);
        }
        int pos_idx = 0;
        int neg_idx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            nums[i] = pos_arr.get(pos_idx);
            pos_idx++;
        }
        for (int i = 1; i < nums.length; i += 2) {
            nums[i] = neg_arr.get(neg_idx);
            neg_idx++;
        }
        return nums;
    }
}