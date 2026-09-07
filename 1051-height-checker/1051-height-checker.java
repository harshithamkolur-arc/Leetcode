class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        expected = heights.clone();
        Arrays.sort(heights);
        int count = 0;
        for(int i=0;i<heights.length;i++){
            System.out.println(expected[i] + " and " +heights[i]);
            if(expected[i] != heights[i]) count++;
        }
        return count;
    }
}