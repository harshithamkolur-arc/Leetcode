class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int product = 1;
        while(num != 0){
            int val = num % 10;
            sum += val;
            product *= val;
            num /= 10;
        }
        int sumofval = sum + product;
        if(n % sumofval  == 0) return true;
        return false;
    }
}