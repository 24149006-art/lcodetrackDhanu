// Last updated: 2/5/2026, 10:07:36 AM
class Solution {
    public int averageValue(int[] num) {
       int sum=0;
       int count=0;
       for(int x:num){
        if(x%6==0){
            sum+=x;
            count++;
        }
    }
    return count==0?0:sum/count;
}
}