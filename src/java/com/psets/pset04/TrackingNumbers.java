package com.psets.pset04;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TrackingNumbers {
    public static void main(String[] args) {
        try {
            System.out.println("Enter filename: ");

            Scanner input = new Scanner(System.in);

            File file = new File("src/java/com/psets/pset04/textfiles/" + input.nextLine());

            input = new Scanner(file);

            List<Integer> numsList = new ArrayList<Integer>();

            int largestNum = Integer.MIN_VALUE;
            int smallestNum = Integer.MAX_VALUE;
            int sumNumbers = 0;
            int posCount = 0;
            int negCount = 0;
            double average;

            while (input.hasNextLine()) {
                numsList.add(Integer.parseInt(input.nextLine()));
            }

            for (int i = 0; i < numsList.size(); i++) {
                if (numsList.get(i) > 0) {
                    posCount++;
                }
                else if (numsList.get(i) < 0) {
                    negCount++;
                }

                if (numsList.get(i) > largestNum) {
                    largestNum = numsList.get(i);
                }

                if (numsList.get(i) < smallestNum) {
                    smallestNum = numsList.get(i);
                }

                sumNumbers += numsList.get(i);
            }

            average = (double) sumNumbers / (double) numsList.size();

            System.out.printf("Largest number: " + largestNum);
            System.out.printf("\nSmallest number: " + smallestNum);
            System.out.printf("\nAverage number: " + average);
            System.out.printf("\nPositive count: " + posCount);
            System.out.printf("\nNegative count: " + negCount);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
