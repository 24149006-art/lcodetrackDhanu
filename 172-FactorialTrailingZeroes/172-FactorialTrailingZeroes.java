// Last updated: 2/5/2026, 10:08:49 AM
class Solution {
    public int trailingZeroes(int n) {
       int c=0;
       while(n>=5){
        n/=5;
        c+=n;
       }
       return c;
    }
}