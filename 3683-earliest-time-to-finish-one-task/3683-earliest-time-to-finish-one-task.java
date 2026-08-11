class Solution {
    public int earliestTime(int[][] tasks) {
        int Mintime = Integer.MAX_VALUE;
        int len = tasks.length;
        for(int i=0;i<len;i++){
            int taskTime = tasks[i][0] + tasks[i][1];
            Mintime = Math.min(Mintime,taskTime); 
        }
        return Mintime;
    }
}