// Last updated: 2/5/2026, 10:07:06 AM
class Solution {
    public int minimumOperations(int[] nums) {
      int res=0;
      for(int num:nums){
        if(num%3!=0)  res++;  
    }  
    return res;
    }
}