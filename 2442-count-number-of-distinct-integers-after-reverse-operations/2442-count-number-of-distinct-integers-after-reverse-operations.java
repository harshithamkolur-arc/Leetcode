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
            arr.add(reverse(num));
            set.add(num);
        }
        for(Integer num : arr){
            set.add(num);
        }
        return set.size();
    }
}