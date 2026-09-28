class Solution {
    public int maxDepth(String s) {
        int openPar = 0;
        int closedPar = 0;
        int maxDepth = Integer.MIN_VALUE;

        for(char ch : s.toCharArray()){
            if(ch == '(') openPar++;
            else if (ch == ')') closedPar++;

            maxDepth = Math.max(maxDepth, openPar - closedPar);
        }
        return maxDepth;
    }
}