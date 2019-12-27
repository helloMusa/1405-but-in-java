package com.psets.pset03;
import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int userYear = input.nextInt();

        if ((userYear%400 == 0) || (userYear%4 == 0 && userYear%100 != 0)){
            System.out.printf("%d is a leap year.", userYear);
        }
        else {
            System.out.printf("%d is not a leap year.", userYear);
        }

    }
}
