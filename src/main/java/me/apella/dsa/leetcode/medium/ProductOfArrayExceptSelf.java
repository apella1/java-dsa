package me.apella.dsa.leetcode.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productOfArrayExceptSelfUsingDivision(nums)));
        System.out.println(Arrays.toString(new int[4]));
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
