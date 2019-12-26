package com.psets.pset02;
import java.util.Scanner;

public class gradecalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter midterm 1 grade: ");
        double midterm1 = sc.nextDouble();
        System.out.println("Enter midterm 2 grade: ");
        double midterm2 = sc.nextDouble();
        System.out.println("Enter midterm 3 grade: ");
        double midterm3 = sc.nextDouble();
        System.out.println("Enter bonus assignment grade: ");
        double bonus = sc.nextDouble();
        System.out.println("Enter exam grade: ");
        double exam = sc.nextDouble();

        double finalGrade = 0.2*(midterm1 + midterm2 + midterm3) + (0.4-(bonus*0.01))*exam + bonus;
        System.out.printf("Your final grade is %f.", finalGrade);

    }
}
