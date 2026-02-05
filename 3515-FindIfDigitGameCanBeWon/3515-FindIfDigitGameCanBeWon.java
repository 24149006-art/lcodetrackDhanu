// Last updated: 2/5/2026, 10:07:02 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd=0;
        int dd=0;
        for(int x:nums)
        {
            if(x<10) sd+=x;
            else dd+=x;
        }
        if(sd!=dd) return true;
        else return false;
    }
}