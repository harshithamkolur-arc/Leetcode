class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j < n) {
                if (prices[j] > prices[i]) {
                    j++;
                } else {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}