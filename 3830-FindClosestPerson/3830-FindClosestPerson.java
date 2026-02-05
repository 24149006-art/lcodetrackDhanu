// Last updated: 2/5/2026, 10:07:04 AM
class Solution {
    public int findClosest(int x, int y, int z) {
        int d1=Math.abs(x-z);
        int d2=Math.abs(y-z);
        if(d1<d2){
            return 1;
        }
        else if(d2<d1){
            return 2;
        }
        else{
            return 0;
        }
    }
}