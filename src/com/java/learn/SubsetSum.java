package com.java.learn;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {

    public static List<List<Integer>> findSubsetsThatSumToTarget(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // dp[i][j] will be true if there is a subset of the first i elements that has a sum of j
        boolean[][] dp = new boolean[n + 1][target + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true; // There's always a subset with sum 0: the empty subset
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        if (!dp[n][target]) {
            return result; // If there's no subset with the given sum, return empty list
        }

        // Backtrack to find all subsets
        List<Integer> current = new ArrayList<>();
        findSubsets(nums, n, target, dp, current, result);
        return result;
    }

    private static void findSubsets(int[] nums, int i, int sum, boolean[][] dp, List<Integer> current, List<List<Integer>> result) {
        // Base case: If sum is 0, add the current subset to the result
        if (sum == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // If the current sum cannot be achieved using the first i elements, return
        if (i == 0) {
            return;
        }

        // If the sum can be achieved without including nums[i-1]
        if (dp[i - 1][sum]) {
            // Create a new list to avoid modifying the current list
            List<Integer> newCurrent = new ArrayList<>(current);
            findSubsets(nums, i - 1, sum, dp, newCurrent, result);
        }

        // If the sum can be achieved by including nums[i-1]
        if (sum >= nums[i - 1] && dp[i - 1][sum - nums[i - 1]]) {
            current.add(nums[i - 1]);
            findSubsets(nums, i - 1, sum - nums[i - 1], dp, current, result);
            current.remove(current.size() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
    	 int[] nums = {-4,8,0,-9,-6,-10,6,2};
         int target = 8;
        List<List<Integer>> subsets = findSubsetsThatSumToTarget(nums, target);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
