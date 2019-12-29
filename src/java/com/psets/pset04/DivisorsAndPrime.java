package com.psets.pset04;
import java.util.Scanner;

public class DivisorsAndPrime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Part A (While loop)
        System.out.println("Enter an integer: ");

        int userNum = input.nextInt();
        int sumOfDivisors = 0;
        int i = 1;

        System.out.println("The divisors are: ");
        while (i <= userNum) {
            if (userNum%i == 0) {
                System.out.println(i);
                sumOfDivisors += i;
            }
            i++;
        }
        System.out.printf("The sum of the divisors is %d.\n", sumOfDivisors);
        if (sumOfDivisors == (userNum + 1)) {
            System.out.println("The number is prime.");
        }
        else {
            System.out.println("The number is not prime.");
        }

        // Part B (For loop)
        sumOfDivisors = 0;
        for (i = 1; i <= userNum; i++) {
            if (userNum%i == 0) {
                System.out.println(i);
                sumOfDivisors += i;
            }
        }
        System.out.printf("The sum of the divisors is %d.", sumOfDivisors);

    }
}
