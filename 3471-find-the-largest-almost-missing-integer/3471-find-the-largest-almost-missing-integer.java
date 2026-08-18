class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        if (k == 1) {
            int largest = Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    largest = Math.max(largest, entry.getKey());
                }
            }
            return largest == Integer.MIN_VALUE ? -1 : largest;
        } else if (k == nums.length) {
            int largest = Integer.MIN_VALUE;
            for (int val : nums) {
                largest = Math.max(largest, val);
            }
            return largest;
        } else {
            int first = nums[0];
            int last = nums[nums.length-1];

            boolean firstfreq = map.get(first) == 1;
            boolean lastfreq = map.get(last) == 1;

            if(!firstfreq && !lastfreq) return -1;
            if(firstfreq && lastfreq) return Math.max(first,last);
            return firstfreq ? first : last;
            
        }
    }
}