package com.psets.pset03;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("(A)ddition \n(S)ubtraction \n(M)ultiplication \n(D)ivision");
        System.out.println("Please select an operation from the list above: ");
        String userOperation = input.nextLine();

        while (!userOperation.equals("A") && !userOperation.equals("S") && !userOperation.equals("M") && !userOperation.equals("D")){
            System.out.printf("This program does not support the operation %s", userOperation);
            System.out.println("\n(A)ddition \n(S)ubtraction \n(M)ultiplication \n(D)ivision");
            System.out.println("Please select an operation from the list above: ");
            userOperation = input.nextLine();
        }

        System.out.println("Please provide the first integer: ");
        int firstInt = input.nextInt();
        System.out.println("Please provide the second integer: ");
        int secondInt = input.nextInt();

        if (userOperation.equals("A")){
            System.out.printf("%d + %d = %d", firstInt, secondInt, (firstInt + secondInt));
        }
        else if (userOperation.equals("S")){
            System.out.printf("%d - %d = %d", firstInt, secondInt, (firstInt - secondInt));
        }
        else if (userOperation.equals("M")){
            System.out.printf("%d * %d = %d", firstInt, secondInt, (firstInt * secondInt));
        }
        else {
            System.out.printf("%d / %d = %d with remainder %d", firstInt, secondInt, (firstInt / secondInt), (firstInt % secondInt));
        }
    }
}
