class Solution {
    public boolean palindrome(String word) {
        int i = 0;
        int len = word.length();
        int mid = len / 2;
        while (i < mid) {
            if (word.charAt(i) != word.charAt(len - 1 - i))
                return false;
            i++;
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        for (String str : words) {
            if (palindrome(str))
                return str;
        }
        return "";
    }
}