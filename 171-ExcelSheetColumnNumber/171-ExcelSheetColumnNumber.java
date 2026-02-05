// Last updated: 2/5/2026, 10:08:51 AM
class Solution {
    public int titleToNumber(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            res=res*26+s.charAt(i)-64;
        }
        return res;
    }
}