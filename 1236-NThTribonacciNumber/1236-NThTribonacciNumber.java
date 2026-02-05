// Last updated: 2/5/2026, 10:08:07 AM
class Solution {
    public int tribonacci(int n) {
        if(n==0 || n==1) return n;
        if(n==2) return 1;
        int prev1=0,prev2=1,prev3=1;
        int next =0;
        for(int i=2;i<n;i++){
            next=prev1+prev2+prev3;
            prev1=prev2;
            prev2=prev3;
            prev3=next;
        }
        return next;
    }
}