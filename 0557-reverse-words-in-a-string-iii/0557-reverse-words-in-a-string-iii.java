class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            String reverse = new StringBuilder(words[i]).reverse().toString();
            words[i] = reverse;
        }
        String ans = String.join(" ",words);
        return ans;
    }
}