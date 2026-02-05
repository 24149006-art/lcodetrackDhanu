// Last updated: 2/5/2026, 10:07:56 AM
class Solution {
    public int numWaterBottles(int NB, int NE) {
        int drink=NB;
        int empty=NB;
        while(empty>=NE){
            int newD=empty/NE;
            empty=(empty%NE)+newD;
            drink+=newD;
        }
        return drink;
    }
}