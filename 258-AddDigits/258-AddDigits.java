// Last updated: 2/5/2026, 10:08:40 AM
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        return num%9==0?9:num%9;
    }
}