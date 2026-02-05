// Last updated: 2/5/2026, 10:07:01 AM
class Solution {
    public String winningPlayer(int x, int y) {
       int turn=1;
       while(x>=1 && y>=4){
        x-=1;
        y-=4;
        turn++;
       }
       if(turn%2==0) return "Alice";
       else return "Bob"; 
    }
}