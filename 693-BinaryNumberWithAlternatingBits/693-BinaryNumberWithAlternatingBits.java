// Last updated: 2/5/2026, 10:08:17 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
           int x=(n^(n>>1));
           return(x&(x+1))==0?true:false;
    }
}