class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIdx = 0;
        int maxIdx = 0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
                minIdx = i;
            }
            if(nums[i]>max){
                max = nums[i];
                maxIdx = i;
            }
        }
        int minDelete = Integer.MAX_VALUE;
        int[] arr = new int[3];
        arr[0] = Math.max(minIdx,maxIdx) + 1;
        arr[1] = n - Math.min(minIdx,maxIdx);
        arr[2] = (Math.min(minIdx,maxIdx) + 1) + (n - Math.max(minIdx,maxIdx));
        for(int val: arr){
            minDelete = Math.min(minDelete,val);
        }
        return minDelete;
    }
}
