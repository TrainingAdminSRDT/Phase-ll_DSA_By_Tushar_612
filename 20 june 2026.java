class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }
}
----------------------------------------------------------------------------------------------------------------------------

class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
----------------------------------------------------------------------------------------------------------------------------

class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<Integer> currentPath, int[] nums, int target, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(currentPath));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < nums.length; i++) {
            currentPath.add(nums[i]);
            backtrack(currentPath, nums, target - nums[i], i);
            currentPath.remove(currentPath.size() - 1);
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, nums, subset, res);
        return res;        
    }

    private void backtrack(int i, int[] nums, List<Integer> subset, List<List<Integer>> res) {
        if (i == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        backtrack(i + 1, nums, subset, res);
        subset.remove(subset.size() - 1);

        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }

        backtrack(i + 1, nums, subset, res);
    }    
}
-------------------------------------------------------------------------------------------------------------------------------
