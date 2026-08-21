class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            int idx = (int) (words[i].charAt(words[i].length() - 1) - '0');
            sorted[idx - 1] = words[i].substring(0, words[i].length() - 1);
        }
        String sentence = String.join(" ", sorted);
        return sentence;
    }
}