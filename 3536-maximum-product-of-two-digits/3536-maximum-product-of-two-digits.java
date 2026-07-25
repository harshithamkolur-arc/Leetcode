class Solution {
    public int maxProduct(int n) {
        List<Integer> arr = new ArrayList<>();
        while (n != 0) {
            arr.add(n % 10);
            n /= 10;
        }
        int ans = Integer.MIN_VALUE;
        int len = arr.size();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr.get(i) * arr.get(j) > ans)
                    ans = arr.get(i) * arr.get(j);
            }
        }
        return ans;
    }
}