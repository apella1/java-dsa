package me.apella.dsa.algorithms.recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(iterativeFactorial(7));
        System.out.println(iterativeFactorial(-7));
        System.out.println(recursiveFactorial(7));
    }

    // static methods are called form the main method
    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int num) {
        // breaking condition of the recursion
        // preventing stack overflow
        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }
}
