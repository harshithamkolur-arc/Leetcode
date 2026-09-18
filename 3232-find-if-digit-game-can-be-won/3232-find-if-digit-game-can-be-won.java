class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum = 0;
        int doubleSum = 0;
        for(int val: nums){
            if(val<10) singleSum += val;
            else doubleSum += val;
        }
        if(singleSum == doubleSum) return false;
        return true;
    }
}