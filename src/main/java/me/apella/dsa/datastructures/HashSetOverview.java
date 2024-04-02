package me.apella.dsa.datastructures;

import java.util.HashSet;

public class HashSetOverview {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);
        primeNumbers.remove(5);
        System.out.println(primeNumbers);
        System.out.println(primeNumbers.contains(7));
        System.out.println(primeNumbers.contains(17));

        // looping
        for (Integer num : primeNumbers) {
            System.out.println(num);
        }
    }
}
