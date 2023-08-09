package me.apella.dsa.algorithms.sort.shellsort;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {
    public static void main(String[] args) {
        int[] randomNumbers = new int[20];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(randomNumbers));

        for (int gap = randomNumbers.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < randomNumbers.length; i++) {
                int newElement = randomNumbers[i];
                int j = i;

                while (j >= gap && randomNumbers[j - gap] > newElement) {
                    randomNumbers[j] = randomNumbers[j - gap];
                    j -= gap;
                }

                randomNumbers[j] = newElement;
            }
        }

        System.out.println(Arrays.toString(randomNumbers));
    }
}
