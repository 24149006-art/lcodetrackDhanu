// Last updated: 2/5/2026, 10:08:18 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
            sum+=i; 
        }
        if(sum==num) return true;
        else return false;
    }
}