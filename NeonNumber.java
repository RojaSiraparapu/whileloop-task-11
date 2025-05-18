package com.While;

public class NeonNumber {
    public static void printNeonNumber(int num) {
        int square = num * num;
        int sum = 0;
        int temp = square;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println((sum == num) ? num + " is a Neon number" : num + " is not a Neon number");
    }

    public static void main(String[] args) {
        printNeonNumber(9);
    }
}
