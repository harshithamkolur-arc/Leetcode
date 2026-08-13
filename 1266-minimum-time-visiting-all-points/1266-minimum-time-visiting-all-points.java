class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int total_sec = 0;
        for(int i=1;i<points.length;i++){
            int x_axis = Math.abs(points[i-1][0] - points[i][0]);
            int y_axis = Math.abs(points[i-1][1] - points[i][1]);
            total_sec += Math.max(x_axis,y_axis);
        }
        return total_sec;
    }
}