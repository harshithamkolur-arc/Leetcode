class Solution {
    public boolean find(int[] arr,int num){
        for(int val: arr){
            if(val == num){
                return true;
            }
        }
        return false;
    } 
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        for(int val:nums1){
            if(find(nums2,val)) ans[0]++;
        }
        for(int val:nums2){
            if(find(nums1,val)) ans[1]++;
        }
        return ans;
    }
}