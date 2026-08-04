class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> MissingArr = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i - 1];
            while (val != nums[i] - 1) {
                val += 1;
                MissingArr.add(val);
            }
        }
        Collections.sort(MissingArr);
        return MissingArr;
    }
}