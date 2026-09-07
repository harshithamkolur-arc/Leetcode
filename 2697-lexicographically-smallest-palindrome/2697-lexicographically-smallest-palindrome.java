class Solution {
    public String makeSmallestPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<n/2;i++){
            if(sb.charAt(i) != sb.charAt(n-i-1)){
                if(sb.charAt(i) < sb.charAt(n-i-1)) sb.setCharAt(n-i-1,sb.charAt(i));
                else sb.setCharAt(i,sb.charAt(n-i-1));
            }
        }
        return sb.toString();
    }
}