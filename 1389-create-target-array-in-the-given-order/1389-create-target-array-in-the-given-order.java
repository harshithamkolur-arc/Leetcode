class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        List<Integer> arr = new ArrayList<>();
        int[] ans = new int[len];
        for(int i=0;i<len;i++){
            arr.add(index[i],nums[i]);
        }
        for(int i=0;i<len;i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}