// Last updated: 2/5/2026, 10:07:38 AM
class Solution {
    public int commonFactors(int a, int b) {
       int count=0;
       int min=a<b?a:b;
       for(int i=1;i<=min;i++){
        if(b%i==0 && a%i==0)
        count++; 
       }
       return count; 
    }
}