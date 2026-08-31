class Solution {
    public int minMoves(int[] nums) {
        int sumOfMoves = 0;
        int max = Arrays.stream(nums).max().orElse(0);
        for(int val:nums){
            sumOfMoves += max - val;
        }
        return sumOfMoves;
    }
}