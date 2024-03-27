package me.apella.dsa.leetcode.easy;

public class MaximumAverageSubArrayI {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    // sliding window algorithm
    public static double findMaxAverage(int[] nums, int k) {
        // get sum for starting window
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;

        // start sliding window
        int startIndex = 0;
        int endIndex = k;

        while (endIndex < nums.length) {
            sum -= nums[startIndex];
            startIndex++;
            sum += nums[endIndex];
            endIndex++;
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}
