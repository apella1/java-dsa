package me.apella.dsa.leetcode.easy;


import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isValidAnagram("cata", "atac"));
    }

    public static boolean isValidAnagram(String s, String p) {
        return sortedString(s).equals(sortedString(p));
    }

    public static String sortedString(String s) {
        char[] strChars = s.toCharArray();
        Arrays.sort(strChars);
        return new String(strChars);
    }
}
