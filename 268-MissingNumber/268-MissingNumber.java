// Last updated: 2/5/2026, 10:08:36 AM
class Solution {
    public int missingNumber(int[] nums) {
       int val=0;
       for(int i=0;i<=nums.length;i++){
        val^=i;
       } 
       for(int x:nums){
        val^=x;
       }
       return val;
    }
}