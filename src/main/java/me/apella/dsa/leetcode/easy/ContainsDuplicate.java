package me.apella.dsa.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public static void main(String[] args) {
    int[] nums = {2, 3, 4, 2};
    System.out.println(containsDuplicate(nums));
    System.out.println("Brute Force");
    System.out.println(containsDuplicateBruteForce(nums));
    System.out.println("Hash Map");
    System.out.println(containsDuplicateHashMap(nums));
    System.out.println("Hash Set Early Exit");
    System.out.println(containsDuplicateSetIdiomatic(nums));
    System.out.println("Contains Duplicate Idiomatic");
    System.out.println(containsDuplicateHashMapIdiomatic(nums));
    System.out.println("Stream");
    System.out.println(containsDuplicateStream(nums));
  }

  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> uniques = new HashSet<>();
    for (int num : nums) {
      if (uniques.contains(num)) {
        return true;
      }
      uniques.add(num);
    }
    return false;
  }

  public static boolean containsDuplicateSetIdiomatic(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (int num : nums) {
      if (!seen.add(num)) {
        return true;
      }
    }
    return false;
  }

  public static boolean containsDuplicateBruteForce(int[] nums) {
    int arr_len = nums.length;

    // (0, 1) (1, 2) ... (arr_len - 2, arr_len - 1)
    for (int i = 0; i < arr_len - 1; i++) {
      for (int j = i + 1; j < arr_len; j++) {
        if (nums[i] == nums[j]) {
          return true;
        }
      }
    }

    return false;
  }

  public static boolean containsDuplicateHashMap(int[] nums) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    for (int i : nums) {
      if (hashMap.containsKey(i)) {
        return true;
      }

      hashMap.put(i, 1);
    }

    return false;
  }

  public static boolean containsDuplicateHashMapIdiomatic(int[] nums) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    for (int i : nums) {
      var count = hashMap.getOrDefault(i, 0) + 1;

      if (count > 1) {
        return true;
      }

      hashMap.put(i, count);
    }

    return false;
  }

  public static boolean containsDuplicateStream(int[] nums) {
    return Arrays.stream(nums).distinct().count() < nums.length;
  }
}
