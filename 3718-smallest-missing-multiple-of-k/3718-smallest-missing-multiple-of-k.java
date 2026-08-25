class Solution {
    public int missingMultiple(int[] nums, int k) {
        int mult = 1;
        int i = 0;
        Arrays.sort(nums);
        while(i < nums.length){
            if(nums[i] == k * mult) mult++;
            i++;
        }
        return k * mult;
    }
}