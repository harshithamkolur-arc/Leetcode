class Solution {
    public int reverseDegree(String s) {
      int degree = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = 26 - ((int)s.charAt(i) - 'a');
            degree += (i+1) * val;
        }
        return degree;
    }
}