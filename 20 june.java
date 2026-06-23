1. Fibonacci Number(LeetCode 509)...

 class Solution {
    public int fib(int n) {
        if(n == 0) return 0;

        else if(n == 1) return 1;
        
        return fib(n-1) + fib(n-2);
    }
}

------------------------------------------------------------------------------------------

2. Climbing Stairs(LeetCode 70)...

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int prev2 = 1;
        int prev1 = 2;

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}

------------------------------------------------------------------------------------------

3. Combination Sum(LeetCode 39)...

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int idx, int[] candidates, int target,
                           List<Integer> temp, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (idx == candidates.length || target < 0) {
            return;
        }

        // Pick current element
        if (candidates[idx] <= target) {
            temp.add(candidates[idx]);
            backtrack(idx, candidates, target - candidates[idx], temp, ans);
            temp.remove(temp.size() - 1);
        }

        // Skip current element
        backtrack(idx + 1, candidates, target, temp, ans);
    }
}

------------------------------------------------------------------------------------------

4. Subsets II(LeetCode 90)...
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int idx, int[] nums,
                           List<Integer> temp,
                           List<List<Integer>> ans) {

        ans.add(new ArrayList<>(temp));

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) continue;

            temp.add(nums[i]);
            backtrack(i + 1, nums, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }
}


------------------------------------------------------------------------------------------
