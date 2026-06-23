class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Search left half
            if (target < nums[mid]) {
                right = mid - 1;
            }
            // Search right half
            else {
                left = mid + 1;
            }
        }

        return -1;
    }
}