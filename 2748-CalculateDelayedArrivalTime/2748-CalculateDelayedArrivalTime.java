// Last updated: 2/5/2026, 10:07:19 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime)%24;
    }
}