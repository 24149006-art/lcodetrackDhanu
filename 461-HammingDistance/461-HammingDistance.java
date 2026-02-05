// Last updated: 2/5/2026, 10:08:22 AM
class Solution {
    public int hammingDistance(int x, int y) {
        int n=x^y;
        int count=0;
        while(n!=0){
             n=(n&(n-1));
             count++;
         }
        return count;
    }
}