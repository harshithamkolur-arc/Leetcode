class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> initial = new ArrayList<>();
        for (int val : nums) {
            List<Integer> arr = new ArrayList<>();
            if (val < 10)
                initial.add(val);
            else {
                while (val != 0) {
                    arr.add(val % 10);
                    val /= 10;
                }
                Collections.reverse(arr);
                initial.addAll(arr);
            }
        }
        int len = initial.size();
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = initial.get(i);
        }
        return ans;
    }
}