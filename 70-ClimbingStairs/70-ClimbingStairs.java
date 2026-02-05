// Last updated: 2/5/2026, 10:09:01 AM
class Solution {
    public int climbStairs(int n) {
        if (n <= 3) return n;
        int prev1 = 3;
        int prev2 = 2;
        int cur = 0;
        for (int i = 3; i < n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return cur;        
    }
}