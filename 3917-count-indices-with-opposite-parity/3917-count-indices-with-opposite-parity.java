class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] % 2 == 0 && nums[j] % 2 != 0) arr[i]++;
                else if(nums[j] % 2 == 0 && nums[i] % 2 != 0) arr[i]++;
            }
        }
        return arr;
    }
}