class Solution {
    public int minElement(int[] nums) {
        for(int i =0;i<nums.length;i++){
            int sum = 0;
            while(nums[i] != 0){
                sum += nums[i] % 10;
                nums[i] /= 10;
            }
            nums[i] = sum;
        }
        return Arrays.stream(nums).min().getAsInt(); 
    }
}