package me.apella.dsa.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAnagrams("abab", "ab"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int startIndex = 0;
        int endIndex = p.length();

        List<Integer> anagramStartIndices = new ArrayList<Integer>();

        while (endIndex <= s.length()) {
            String chunk = s.substring(startIndex, endIndex);
            boolean isValid = isValidAnagram(chunk, p);
            if (isValid) {
                anagramStartIndices.add(startIndex);
            }
            startIndex++;
            endIndex++;
        }
        return anagramStartIndices;
    }

    public static boolean isValidAnagram(String word, String piece) {
        return sortedString(word).equals(sortedString(piece));
    }

    public static String sortedString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
