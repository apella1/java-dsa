package me.apella.dsa.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
  public static void main(String[] args) {
    System.out.println("Sorting Solution");
    System.out.println(isValidAnagram("cata", "atac"));
    System.out.println("NeetCode's solution");
    System.out.println(isAnagram("cata", "atac"));
    System.out.println("HashMapSolution");
    System.out.println(isAnagramUsingMap("cata", "atac"));
  }

  public static boolean isValidAnagram(String s, String p) {
    return sortedString(s).equals(sortedString(p));
  }

  public static String sortedString(String s) {
    char[] strChars = s.toCharArray();
    Arrays.sort(strChars);
    return new String(strChars);
  }

  // NeetCode's solution
  public static boolean isAnagram(String s, String p) {
    if (s.length() != p.length()) return false;
    int[] store = new int[26];
    for (int i = 0; i < s.length(); i++) {
      store[s.charAt(i) - 'a']++;
      store[p.charAt(i) - 'a']--;
    }
    for (int n : store) {
      if (n != 0) {
        return false;
      }
    }
    return true;
  }

  // using hashmaps
  public static boolean isAnagramUsingMap(String s, String t) {
    if (s.length() != t.length()) return false;
    HashMap<Character, Integer> count = new HashMap<>();
    for (char a : s.toCharArray()) {
      count.put(a, count.getOrDefault(a, 0) - 1);
    }
    for (char b : t.toCharArray()) {
      count.put(b, count.getOrDefault(b, 0) + 1);
    }
    for (int val : count.values()) {
      if (val != 0) return false;
    }
    return true;
  }
}
