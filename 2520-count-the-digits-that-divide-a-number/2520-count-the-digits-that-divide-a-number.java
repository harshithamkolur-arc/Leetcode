class Solution {
    public int countDigits(int num) {
        int store = num;
        int count = 0;
        while (store != 0) {
            int divisor = store % 10;
            if (num % divisor == 0)
                count++;
            store /= 10;
        }
        return count;
    }
}