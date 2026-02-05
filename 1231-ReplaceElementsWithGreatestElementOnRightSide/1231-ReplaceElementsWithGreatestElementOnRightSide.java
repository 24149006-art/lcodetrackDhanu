// Last updated: 2/5/2026, 10:08:09 AM
class Solution {
    public int[] replaceElements(int[] arr) {
       int max=-1;
       int Cmax=-1;
       for(int i=arr.length-1;i>=0;i--){
        if(arr[i]>Cmax) Cmax=arr[i];
        arr[i]=max;
        max=Cmax;
       }
       return arr;
       } 
    }