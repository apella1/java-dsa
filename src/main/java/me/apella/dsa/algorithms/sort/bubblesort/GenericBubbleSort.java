package me.apella.dsa.algorithms.sort.bubblesort;

import java.util.Arrays;
import java.util.Random;

public class GenericBubbleSort<T extends Comparable<T>> {
    public static void main(String[] args) {
        Integer[] randomNumbers = new Integer[20];
        Random random = new Random();
        for (int a = 0; a < randomNumbers.length; a++) {
            randomNumbers[a] = random.nextInt(800);
        }

        System.out.println(Arrays.toString(randomNumbers));
        GenericBubbleSort<Integer> intBubbleSort = new GenericBubbleSort<>();
        intBubbleSort.sort(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));
    }

    public void sort(T[] array) {
        int arrayLength = array.length;
        boolean swapped;

        for (int i = 0; i < arrayLength - 1; i++) {
            swapped = false;
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {break;}
        }
    }
}
