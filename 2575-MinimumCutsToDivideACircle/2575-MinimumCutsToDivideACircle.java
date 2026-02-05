// Last updated: 2/5/2026, 10:07:31 AM
class Solution {
    public int numberOfCuts(int n) {
       if(n==1) return 0;
       if(n%2==0) return n/2;
       else return n;
    }
}