class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        List<Integer> lsNums1 = new ArrayList<>();
        List<Integer> lsNums2 = new ArrayList<>();

        for(int val : nums1) set1.add(val);
        for(int val : nums2) set2.add(val);

        for(int val : set1){
            if(!set2.contains(val)) lsNums1.add(val);
        }
        for(int val : set2){
            if(!set1.contains(val)) lsNums2.add(val);
        }

        return Arrays.asList(lsNums1,lsNums2);
    }
}