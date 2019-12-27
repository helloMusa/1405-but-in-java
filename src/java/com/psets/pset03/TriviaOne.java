package com.psets.pset03;
import java.util.Scanner;

public class TriviaOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Which boxer was known as “The Greatest” and “The People’s Champion”?");
        String answerOne = input.nextLine();
        System.out.println("Which email service is owned by Microsoft?");
        String answerTwo = input.nextLine();

        int correctCount = 0;
        int incorrectCount = 0;
        int userScore = 0;

        if (answerOne.toLowerCase().equals("muhammad ali")){
            correctCount++;
            userScore++;
        }
        else {
            incorrectCount++;
        }
        if (answerTwo.toLowerCase().equals("microsoft")){
            correctCount++;
            userScore++;
        }
        else {
            incorrectCount++;
        }

        System.out.printf("You got %d question(s) right and %d question(s) wrong. Your score is %d.", correctCount, incorrectCount, userScore);

    }
}
