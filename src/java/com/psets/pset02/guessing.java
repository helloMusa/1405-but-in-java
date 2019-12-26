package com.psets.pset02;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // generate random int
        int rand_int = rand.nextInt(101);

        // get guess from user
        System.out.println("Enter your guess: ");
        int guess = sc.nextInt();

        // get abs distance from guess to actual num
        int distance = Math.abs(guess - rand_int);

        if (distance != 0) {
            System.out.printf("Good try! You guessed %d while the actual number was %d. You were %d numbers off.", guess, rand_int, distance);
        }
        else {
            System.out.printf("Good job!");
        }

    }
}
