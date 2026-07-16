class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int curr = n;
        while (curr != 0) {
            rev = (rev * 10) + (curr % 10);
            curr /= 10;
        }
        return Math.abs(rev - n);
    }
}