class Solution {
    int maximum(int[] nums,int end){
        int max_val = Integer.MIN_VALUE;
        for(int i=0;i<=end;i++){
            max_val = Math.max(max_val,nums[i]);
        }
        return max_val;
    }
    int minimum(int[] nums,int start){
        int min_val = Integer.MAX_VALUE;
        for(int i=start;i<nums.length;i++){
            min_val = Math.min(min_val,nums[i]);
        }
        return min_val;
    }
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int score = maximum(nums,i) - minimum(nums,i);
            if(score <= k) return i;
        }
        return -1;
    }
}