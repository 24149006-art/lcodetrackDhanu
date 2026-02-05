// Last updated: 2/5/2026, 10:07:27 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0;
        int ds=0;
        for(int x:nums){
            es+=x;
            while(x!=0){
                ds+=x%10;
                x/=10;
            }
        }
        return es-ds;
    }
}