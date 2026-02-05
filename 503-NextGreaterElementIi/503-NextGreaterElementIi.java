// Last updated: 2/5/2026, 10:08:20 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack();
        int[] res = new int[n];
        Arrays.fill(res, -1); 
        for (int i = 0; i < n*2; i++) {
            int x= nums[i%n];
            while (!stack.isEmpty() && x>nums[stack.peek()]) {
                res[stack.peek()] = x;
                stack.pop();
            }
            stack.push(i%n);
            }
        return res;
    }
}     