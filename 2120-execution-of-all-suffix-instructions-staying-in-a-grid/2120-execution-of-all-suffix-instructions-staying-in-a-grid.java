class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int len = s.length();
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            int count = 0;
            int[] pos = startPos.clone();
            for (int j = i; j < len; j++) {
                if (s.charAt(j) == 'R')
                    pos[1]++;
                else if (s.charAt(j) == 'L')
                    pos[1]--;
                else if (s.charAt(j) == 'U')
                    pos[0]--;
                else if (s.charAt(j) == 'D')
                    pos[0]++;       
                if (pos[0] < 0 || pos[0] >= n || pos[1] < 0 || pos[1] >= n)
                    break;  
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}