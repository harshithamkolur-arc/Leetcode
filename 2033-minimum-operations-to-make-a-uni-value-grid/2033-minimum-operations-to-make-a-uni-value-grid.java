class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> arr = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        Set<Integer> remainder = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr.add(grid[i][j]);
                remainder.add(grid[i][j] % x);
                if(remainder.size() != 1) return -1;
            }
        }
        Collections.sort(arr);
        int mid = arr.size() / 2;
        for (Integer val : arr) {
            count += Math.abs(val - arr.get(mid)) / x;
        }
        return count;
    }
}