// Last updated: 2/5/2026, 10:08:52 AM
class Solution {
    public String convertToTitle(int num) {
        StringBuffer ans=new StringBuffer();
        
        while(num>0){
        num--;
        ans.append((char)((num%26)+65));
        num/=26;
        }
        
        return ans.reverse().toString();
    }
}