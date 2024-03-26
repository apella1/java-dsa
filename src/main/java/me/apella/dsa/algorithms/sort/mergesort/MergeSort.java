package me.apella.dsa.algorithms.sort.mergesort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] randomNumbers = new int[15];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(200);
        }
        System.out.println(Arrays.toString(randomNumbers));
        mergeSort(randomNumbers, 0, randomNumbers.length);
        System.out.println(Arrays.toString(randomNumbers));
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end -start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid-1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = end;
        int tempIndex = 0;
        int[] temp = new int[end -start];

        while(i < mid && j < end) {
             temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }
}
