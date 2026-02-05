// Last updated: 2/5/2026, 10:06:59 AM
class Solution {
    public int absDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int minsum=0;
        int maxsum=0;
            for(int i=0;i<k;i++){
                 minsum+=nums[i];
                 maxsum+=nums[n-1-i];
      }
        return maxsum-minsum;
    }
}