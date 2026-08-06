class Solution {
    int mult(int n) {
        int product = 1;
        while (n != 0) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }

    public int smallestNumber(int n, int t) {
        int product = mult(n);
        while (product % t != 0) {
            product = mult(n + 1);
            n++;
        }
        return n;
    }
}