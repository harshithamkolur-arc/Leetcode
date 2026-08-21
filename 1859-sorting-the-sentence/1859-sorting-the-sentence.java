class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String currWord = words[i];
            int idx = Character.getNumericValue(currWord.charAt(currWord.length() - 1));
            sorted[idx - 1] = currWord.substring(0, currWord.length() - 1);
        }
        String sentence = String.join(" ", sorted);
        return sentence;
    }
}