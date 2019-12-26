package com.psets.pset02;
import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        double volume = width * length * height;
        System.out.printf("The volume is %f.", volume);

    }
}
