package com.psets.pset05;
import java.util.Scanner;

public class NumberOfDigits {
    static int numDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        System.out.printf("Length of %d: %d", num, numDigits(num));
    }
}
