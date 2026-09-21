class Solution {
    boolean digits(int n){
        boolean changed = false;
        while(n != 0){  
            int digit = n % 10;
            if (digit == 3 || digit == 4 || digit == 7) return false;
            if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                changed = true;
            }
            n /= 10;
        }
        return changed;
    }
    public int rotatedDigits(int n) {
        int count = 0;
        for (int val = 1; val <= n; val++) {
            if(digits(val)) count++; 
        }
        return count;
    }
}