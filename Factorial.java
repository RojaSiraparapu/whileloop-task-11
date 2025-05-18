package com.While;
public class Factorial {

    public int calculateFactorial(int num) {
        if (num < 0) {
            System.out.println(num + " is not a valid input for factorial.");
            return -1; // Indicating an error
        }

        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();

        int result1 = obj.calculateFactorial(4);
        if (result1 != -1) {
            System.out.println("Factorial of 4 is: " + result1);
        }

        int result2 = obj.calculateFactorial(16);
        if (result2 != -1) {
            System.out.println("Factorial of 16 is: " + result2);
        }
    }
}
