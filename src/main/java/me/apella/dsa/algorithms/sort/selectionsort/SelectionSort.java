package me.apella.dsa.algorithms.sort.selectionsort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[15];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(randomNumbers));

        for (int lastUnsortedIndex = randomNumbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (randomNumbers[i] > randomNumbers[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(randomNumbers, largestIndex, lastUnsortedIndex);
        }

        System.out.println(Arrays.toString(randomNumbers));

    }

    public static void swap(int[] array, int a, int b) {
        if (a == b) {
            return;
        }
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
