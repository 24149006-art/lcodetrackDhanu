// Last updated: 2/5/2026, 10:08:01 AM
class Solution {
    public int numberOfSteps(int num) {
        int steps=0;
        while(num!=0){
            if(num%2==0) num=num/2;
            else num=num-1;
            steps++;
        }
        return steps;
    }
}