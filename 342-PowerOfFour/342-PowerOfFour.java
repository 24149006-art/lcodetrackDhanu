// Last updated: 2/5/2026, 10:08:31 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        return(n>0 && (((n&(n-1))==0)) &&(n%3==1));
    }
}