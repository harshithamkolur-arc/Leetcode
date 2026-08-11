class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> permutaion = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            permutaion.add(i);
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int index = permutaion.indexOf(queries[i]);
            ans[i] = index;
            int val = permutaion.get(index);
            permutaion.remove(index);
            permutaion.add(0, val);
        }
        return ans;
    }
}