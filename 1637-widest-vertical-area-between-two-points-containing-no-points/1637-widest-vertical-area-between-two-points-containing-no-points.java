class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] x_points = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            x_points[i] = points[i][0];
        }
        Arrays.sort(x_points);
        int wid = Integer.MIN_VALUE;
        for (int i = 1; i < x_points.length; i++) {
            int curr = x_points[i] - x_points[i - 1];
            wid = Math.max(wid, curr);
        }
        return wid;
    }
}