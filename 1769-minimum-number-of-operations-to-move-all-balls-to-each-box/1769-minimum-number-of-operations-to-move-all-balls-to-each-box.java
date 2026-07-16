class Solution {
    public int[] minOperations(String boxes) {
        List<Integer> arr = new ArrayList<>();
        int[] ans = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1')
                arr.add(i);
        }
        for (int i = 0; i < boxes.length(); i++) {
            int sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                sum += Math.abs(i - arr.get(j));
            }
            ans[i] = sum;
        }
        return ans;
    }
}