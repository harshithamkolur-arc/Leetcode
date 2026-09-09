class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] srt = startTime.split(":");
        String[] end = endTime.split(":");

        int startHour = Integer.parseInt(srt[0]);
        int startMin = Integer.parseInt(srt[1]);
        int startSec = Integer.parseInt(srt[2]);

        int endHour = Integer.parseInt(end[0]);
        int endMin = Integer.parseInt(end[1]);
        int endSec = Integer.parseInt(end[2]);

        int start = (startHour * 3600) + (startMin * 60) + startSec;
        int end_time = (endHour * 3600) + (endMin * 60) + endSec;

        return Math.abs(start - end_time);
    }
}