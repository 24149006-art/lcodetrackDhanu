// Last updated: 2/5/2026, 10:07:14 AM
class Solution {
    public int distanceTraveled(int MT, int AT) {
        int total=0;
        while(MT>=5){
            total+=50;
            MT-=5;
            if(AT>=1) {
                MT++;
                AT--;
            }
        }
        return total+(MT*10);
    }
}