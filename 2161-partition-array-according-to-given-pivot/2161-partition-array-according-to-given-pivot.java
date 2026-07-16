class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        for(int val: nums){
            if(val<pivot) less.add(val);
            else if(val>pivot) greater.add(val);
            else equal.add(val);
        }
        List<Integer> combine = new ArrayList<>();
        combine.addAll(less);
        combine.addAll(equal);
        combine.addAll(greater);
        for(int i=0;i<nums.length;i++){
            nums[i] = combine.get(i);
        }
        return nums;
    }
}