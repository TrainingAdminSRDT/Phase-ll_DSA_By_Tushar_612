/*
 * Number: 0560
 * Title: Subarray Sum Equals K
 * Difficulty: Medium
 * Tags: Array, Hash Table, Prefix Sum
 * Language: C++
 * URL: https://leetcode.com/problems/subarray-sum-equals-k/
 * Date: 2026-06-18
 * Runtime: 0 ms
 * Memory: N/A
 */

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> mp;
        mp[0] = 1;

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (mp.find(sum - k) != mp.end()) {
                count += mp[sum - k];
            }

            mp[sum]++;
        }

        return count;
    }
};