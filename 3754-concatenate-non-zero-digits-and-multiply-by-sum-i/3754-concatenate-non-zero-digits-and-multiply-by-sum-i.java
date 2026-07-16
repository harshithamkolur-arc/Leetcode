class Solution {
    public long sumAndMultiply(int n) {
        long ans = 0;
        int mul = 1;
        int sum = 0;
        while (n != 0) {
            int val = n % 10;
            if (val != 0) {
                ans = val * mul + ans;
                mul *= 10;
                sum += val;
            }
            n /= 10;
        }
        return (ans * sum);
    }
}