// Last updated: 7/20/2026, 12:20:38 PM
1class Solution {
2    public List<Integer> grayCode(int n) {
3        List<Integer> result = new LinkedList<>();
4        for (int i = 0; i < 1<<n; i++) result.add(i ^ i>>1);
5        return result;
6    }
7}