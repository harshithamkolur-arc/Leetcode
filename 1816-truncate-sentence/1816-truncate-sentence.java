class Solution {
    public String truncateSentence(String s, int k) {
        List<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words.add(word);
                word = "";
            } else {
                word += s.charAt(i);
            }
        }
        if (k > words.size())
            return s;
        String ans = "";
        for (int i = 0; i < k - 1; i++) {
            ans += words.get(i);
            ans += " ";
        }
        return ans + words.get(k - 1);
    }
}