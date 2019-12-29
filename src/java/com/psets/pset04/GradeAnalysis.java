package com.psets.pset04;
import java.io.File;
import java.util.*;

public class GradeAnalysis {
    public static void main(String[] args) {
        try {
            System.out.println("Enter filename: ");

            Scanner input = new Scanner(System.in);

            File file = new File("src/java/com/psets/pset04/textfiles/" + input.nextLine());

            input = new Scanner(file);

            List<Double> studentGrades = new ArrayList<Double>();
            List<String> studentNames = new ArrayList<String>();

            int passCount = 0;
            int failCount = 0;
            double sumOfGrades = 0;

            // Get full names and overall averages and add to respective lists
            while (input.hasNextLine()) {
                double studentGrade = 0;

                String firstName = input.nextLine();
                String lastName = input.nextLine();
                String studentNum = input.nextLine();

                studentNames.add(firstName + " " + lastName);

                double assignmentGrade = Double.parseDouble(input.nextLine());
                double midtermGrade = Double.parseDouble(input.nextLine());
                double examGrade = Double.parseDouble(input.nextLine());

                studentGrade = (0.25*assignmentGrade + 0.25*midtermGrade + 0.5*examGrade);
                studentGrades.add(studentGrade);
                sumOfGrades += studentGrade;

                // Check if student failed or passed and update appropriate counter
                if (examGrade >= 50 && studentGrade >= 50) {
                    passCount++;
                }
                else {
                    failCount++;
                }
            }

            // Calculate average overall grade
            double averageGrade = sumOfGrades / (double) (studentGrades.size());

            // Get highest grade and associated student
            double highestGrade = Integer.MIN_VALUE;
            String bestStudent = studentNames.get(0);

            for (int i = 0; i < studentGrades.size(); i++) {
                if (studentGrades.get(i) > highestGrade) {
                    highestGrade = studentGrades.get(i);
                    bestStudent = studentNames.get(i);
                }
            }

            // Get lowest grade and associated student
            double lowestGrade = Integer.MAX_VALUE;
            String worstStudent = studentNames.get(0);

            for (int i = 0; i < studentGrades.size(); i++) {
                if (studentGrades.get(i) < lowestGrade) {
                    lowestGrade = studentGrades.get(i);
                    worstStudent = studentNames.get(i);
                }
            }

            System.out.printf("Number of Passes: " + passCount);
            System.out.printf("\nNumber of Fails: " + failCount);
            System.out.printf("\nAverage Final Grade: " + averageGrade);
            System.out.printf("\nThe Highest Grade: %s - %f", bestStudent, highestGrade);
            System.out.printf("\nThe Lowest Grade: %s - %f", worstStudent, lowestGrade);

            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
