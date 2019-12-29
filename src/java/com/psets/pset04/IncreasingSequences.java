package com.psets.pset04;
import java.util.Scanner;
import java.util.*;

public class IncreasingSequences {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer or 'q' to quit: ");
        String userNum = input.nextLine();
        while (userNum != "q") {
            System.out.println("Enter a positive integer or 'q' to quit: ");
            userNum = input.nextLine();
        }

    }

}
