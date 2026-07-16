class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max_candies = Integer.MIN_VALUE;
        for (int count : candies) {
            if (count > max_candies)
                max_candies = count;
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max_candies)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}