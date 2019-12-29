package com.psets.pset04;
import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userNum = input.nextInt();
        int i = 0;

        while (userNum != 0) {
            userNum /= 10;
            i ++;
        }

        System.out.printf("There are %d digits in that number. ", i);

    }
}
