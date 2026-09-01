class Solution {
    int sevenSum(int start,int times){
        int i = 1;
        int sum = 0;
        while(i<=times){
            sum += start;
            start++;
            i++;
        }
        return sum;
    }
    public int totalMoney(int n) {
        int times = n/7;
        int start = 1;
        int totalSum = 0;
        while(times !=0){
            totalSum += sevenSum(start,7);
            start++;
            times--;
        }
        totalSum += sevenSum(start,n%7);
       return totalSum;
    }
}