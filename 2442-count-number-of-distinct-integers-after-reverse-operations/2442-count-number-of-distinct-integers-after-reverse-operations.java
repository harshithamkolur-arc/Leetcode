class Solution {
    int reverse(int num){
        int ans = 0;
        while(num != 0){
            int val = num % 10;
            ans = (ans * 10) + val;
            num /= 10;
        }
        return ans;
    }
    public int countDistinctIntegers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            int reverse_dig = reverse(num);
            set.add(num);
            set.add(reverse_dig);
        }
        return set.size();
    }
}