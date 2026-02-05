// Last updated: 2/5/2026, 10:07:12 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
              count++;
        }
        }
        return count;  
}
}