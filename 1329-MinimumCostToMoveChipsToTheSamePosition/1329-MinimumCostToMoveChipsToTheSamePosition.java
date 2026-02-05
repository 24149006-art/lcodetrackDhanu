// Last updated: 2/5/2026, 10:08:05 AM
class Solution {
    public int minCostToMoveChips(int[] position) {
       int oddCount=0;
       int evenCount=0;
       for(int x:position){
        if(x%2==1){
        oddCount++;
       }
        else{
        evenCount++;
        }
       } 
       return evenCount<oddCount?evenCount:oddCount;
    }
}