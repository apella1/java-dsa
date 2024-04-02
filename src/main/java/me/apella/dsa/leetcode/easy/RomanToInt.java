package me.apella.dsa.leetcode.easy;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToIntHashmap("MCL"));
        System.out.println(romanToIntHashmap("XIV"));
        System.out.println(romanToIntHashmap("IX"));
        System.out.println(romanToIntHashmap("IV"));
    }

    public static int romanToIntHashmap(String s) {
        HashMap<Character, Integer> numMap = new HashMap<>();
        numMap.put('I', 1);
        numMap.put('V', 5);
        numMap.put('X', 10);
        numMap.put('L', 50);
        numMap.put('C', 100);
        numMap.put('D', 500);
        numMap.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && numMap.get(s.charAt(i)) < numMap.get(s.charAt(i + 1))) {
                res -= numMap.get(s.charAt(i));
                continue;
            }
            res += numMap.get(s.charAt(i));
        }

        return res;
    }
}
