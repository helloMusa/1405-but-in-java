package com.psets.pset02;
import java.util.Scanner;

public class basicinput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.printf("What year were you born in, %s?", name);
        int year = sc.nextInt();
        int age = 2019 - year;

        System.out.printf("Hello, %s. You are now %d years old.", name, age);

    }
}
