class Solution {
    public String replaceDigits(String s) {
        StringBuilder str = new StringBuilder(s);
        for (int i = 1; i < s.length(); i += 2) {
            int ch = (int) str.charAt(i - 1) + ((int) str.charAt(i) - '0');
            str.setCharAt(i, (char) ch);
        }
        return str.toString();
    }
}