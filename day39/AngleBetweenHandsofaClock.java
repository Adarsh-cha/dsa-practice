class Solution {
    public double angleClock(int hour, int minutes) {
        double hr = (hour + (minutes / 60.0)) * 30;
        double min = minutes * 6;

        double angle = Math.abs(hr - min);
        return Math.min(angle, 360 - angle); 
    }
}