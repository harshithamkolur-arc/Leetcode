class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        if(k==1){
            Integer largest = Integer.MIN_VALUE;
            for(Map.Entry<Integer,Integer>entry : map.entrySet()){
                if(entry.getValue() == 1){
                    largest = Math.max(largest,entry.getKey());
                }
            }
            return largest == Integer.MIN_VALUE ? -1 : largest;
        }
        else if(k == nums.length){
            int largest = Integer.MIN_VALUE;
            for(int val : nums){
                largest = Math.max(largest,val);
            }
            return largest;
        }
        else{
           // System.out.println(map.get(nums[0])+" "+map.get(nums[nums.length - 1]));
            if(map.get(nums[0]) > 1 && map.get(nums[nums.length - 1]) > 1){
                
                return -1;
            }
            else if(map.get(nums[0]) > 1){
                return nums[nums.length - 1];
            }
            else if(map.get(nums[nums.length - 1]) > 1){
                return nums[0];
            }
            else{
                return Math.max(nums[0],nums[nums.length - 1]);
            }
        }
    }
}