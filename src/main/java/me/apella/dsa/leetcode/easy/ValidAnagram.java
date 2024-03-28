package me.apella.dsa.leetcode.easy;


import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isValidAnagram("cata", "atac"));
        System.out.println(isAnagram("cata", "atac"));
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
        System.out.println(store[25]);

        for (int n : store) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
