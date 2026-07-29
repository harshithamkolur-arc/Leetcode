class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = Integer.MIN_VALUE;
        for (String sentence : sentences) {
            int count = 0;
            int n = sentence.length();
            int i = 0;
            while (i < n) {
                if (sentence.charAt(i) == ' ')
                    count++;
                i++;
            }
            ans = Math.max(ans, count);
        }
        return ans + 1;
    }
}