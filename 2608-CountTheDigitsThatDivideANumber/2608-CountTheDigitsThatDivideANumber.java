// Last updated: 2/5/2026, 10:07:30 AM
class Solution {
    public int countDigits(int num) {
        int count=0;
        int copy=num;
        while(num!=0){
            int d=num%10;
            num/=10;
            if(copy%d==0)
            count++;
        }
        return count;
    }
}