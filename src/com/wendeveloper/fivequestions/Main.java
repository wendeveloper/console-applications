package com.wendeveloper.fivequestions;

import java.util.Scanner;

public class Main {


    /*

    Exercise 2

Write a quiz program with five true-or-false questions.
Display a question to the user, and ask the user to enter either true or false,
then move on to the next question. At the end of the quiz display the user’s score.

Use three arrays, a String array for holding the questions, a boolean array for the
answers, and another boolean array for the user’s answers.

Hints:

You can use the Scanner’s nextBoolean() method to get the user’s input

Because the questions, answers, and user’s answers are stored in three separate arrays,
you can use their indexes to associate them (e.g. index 1 in the answers array correlates
to index 1 in the questions array)


     */

        public static void main(String[] args) {

            String[] arrQuestions = {
                    "The moon is further away from the earth than the sun is",
                    "Goldfish only have a three second memory",
                    "Microwaves have a longer wavelength than ultraviolet",
                    "Antibiotics are used to treat viral infections",
                    "Octopuses have three hearts"
            };

            boolean[] arrAnswers = {
                    false,
                    false,
                    true,
                    false,
                    true
            };

            boolean[] arrUsersAnswers = new boolean[5];
            int finalScore = 0;

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < arrQuestions.length; i++){
                System.out.println(arrQuestions[i]);
                arrUsersAnswers[i] = scanner.nextBoolean();

                if (arrUsersAnswers[i] == arrAnswers[i]){
                    System.out.println("You are correct!");
                    finalScore++;
                }else{
                    System.out.println("nope.");
                }
            }
            System.out.println("final score: " + finalScore);


        }
}
