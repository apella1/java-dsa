package me.apella.dsa.leetcode.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 4};
        System.out.println(Arrays.toString(productOfArrayExceptSelf(nums)));
        System.out.println(Arrays.toString(productOfArrayExceptSelfExplicitRightLeftArrays(nums)));
    }

    public static int[] productOfArrayExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int p = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = p;
            p *= nums[i];
        }

        p = 1;

        for (int pos = nums.length - 1; pos >= 0; pos--) {
            res[pos] *= p;
            p *= nums[pos];
        }

        return res;
    }

    public static int[] productOfArrayExceptSelfExplicitRightLeftArrays(int[] nums) {
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;

        for (int lIndex = 1; lIndex < left.length; lIndex++) {
            left[lIndex] = nums[lIndex - 1] * left[lIndex - 1];
        }
        for (int rIndex = right.length - 2; rIndex >= 0; rIndex--) {
            right[rIndex] = nums[rIndex + 1] * right[rIndex + 1];
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = right[i] * left[i];
        }

        return ans;
    }

    // doesn't work for arrays with zero as an element (division by zero problem)
    public static int[] productOfArrayExceptSelfUsingDivision(int[] nums) {
        int[] answer = new int[nums.length];
        int product = 1;

        for (int num : nums) {
            product *= num;
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = product / nums[i];
        }
        return answer;
    }
}
