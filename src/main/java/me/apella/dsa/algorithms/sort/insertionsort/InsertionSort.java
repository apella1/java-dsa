package me.apella.dsa.algorithms.sort.insertionsort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(5000);
        }
        System.out.println(Arrays.toString(randomNumbers));

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < randomNumbers.length; firstUnsortedIndex++) {
            int newElement = randomNumbers[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && randomNumbers[i - 1] > newElement; i--) {
                randomNumbers[i] = randomNumbers[i - 1];
            }
            randomNumbers[i] = newElement;
        }

        System.out.println(Arrays.toString(randomNumbers));
    }
}
