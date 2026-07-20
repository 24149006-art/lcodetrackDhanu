// Last updated: 7/20/2026, 12:18:37 PM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> answer = new ArrayList<>();
4        Arrays.sort(nums);
5
6        for (int i = 0; i < nums.length; i++) {
7            // Skip duplicates for the first number
8            if ((i - 1 >= 0) && nums[i - 1] == nums[i]) continue;
9            
10            for (int j = i + 1; j < nums.length; j++) {
11                // Skip duplicates for the second number
12                if ((j - 1 != i) && (nums[j - 1] == nums[j])) continue;
13                
14                int left = j + 1;
15                int right = nums.length - 1;
16                
17                while (left < right) {
18                    // Use long to avoid integer overflow
19                    long acquiredNum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];
20                    
21                    if (acquiredNum < target) {
22                        left++;
23                    } else if (acquiredNum > target) {
24                        right--;
25                    } else {
26                        answer.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
27                        
28                        // Skip duplicates for the third number
29                        while ((left < right) && (nums[left + 1] == nums[left])) left++;
30                        // Skip duplicates for the fourth number
31                        while ((left < right) && (nums[right - 1] == nums[right])) right--;
32                        
33                        left++;
34                        right--;
35                    }
36                }
37            }
38        }
39        return answer;
40    }
41}