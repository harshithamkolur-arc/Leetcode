class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int ans = intervals.length;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length; j++) {
                if (i == j)
                    continue;
                int a = intervals[i][0];
                int b = intervals[i][1];
                int c = intervals[j][0];
                int d = intervals[j][1];
                if (c <= a && b <= d) {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}