// Last updated: 2/5/2026, 10:08:54 AM
class Solution {
    public int singleNumber(int[] nums) {
        int val=0;
        for(int i=0;i<nums.length;i++){
            val=val^nums[i];
        }
        return val;
    }
}