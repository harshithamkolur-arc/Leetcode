class Solution {
    public String stringHash(String s, int k) {
        int n = s.length();
        int start = 0;
        int end = k - 1;
        String[] arr = new String[n / k];
        int idx = 0;
        String st = "";
        while (end < n) {
            int sum = 0;
            while (start <= end) {
                sum += s.charAt(start) - 'a';
                start++;
            }
            int rem = sum % 26;
            st += (char) (rem + 'a');
            end += k;
            idx++;
        }
        return st;
    }
}