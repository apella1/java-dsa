package me.apella.dsa.datastructures;

public class ArraysOverview {
    public static void main(String[] args) {
        // arrays are not dynamic - once an instance is created we cannot change the size of the array
        int[] oddNumbers = new int[7];
        oddNumbers[0] = 1;
        oddNumbers[1] = 3;
        oddNumbers[2] = 5;
        oddNumbers[3] = 7;
        oddNumbers[4] = 9;
        oddNumbers[5] = 11;
        oddNumbers[6] = 13;
        int[] primeNumbers = new int[3];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        int[] randomNumbers = {3, 4, 5, 323, 8};

        // why arrays are zero based
        int index = -1;
        for (int i = 0; i < oddNumbers.length; i ++) {
            if(oddNumbers[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("Index is " + index);

        // enhanced for
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        for (int randomNumber: randomNumbers){
            System.out.println(randomNumber);
        }
    }
}
