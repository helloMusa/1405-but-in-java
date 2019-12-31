package com.psets.pset05;
import java.util.Scanner;

public class CommonMultiples {

    static boolean isMultiple(int a, int b) {
        return b % a == 0;
    }

    static boolean commonMultiple(int a, int b, int c) {
        return isMultiple(a, c) && (isMultiple(b, c));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int a = input.nextInt();
        System.out.println("Enter second integer: ");
        int b = input.nextInt();

        for (int i = 1; i < 101; i++) {
            if (commonMultiple(a, b, i)) {
                System.out.println(i);
            }
        }
    }
}
