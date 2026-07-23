class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> arr = new ArrayList<>();
        for (String word : bank) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == '1')
                    count++;
            }
            if (count != 0)
                arr.add(count);
        }
        if (arr.size() == 1)
            return 0;
        int ans = 0;
        for (int i = 1; i < arr.size(); i++) {
            ans += arr.get(i) * arr.get(i - 1);
        }
        return ans;
    }
}