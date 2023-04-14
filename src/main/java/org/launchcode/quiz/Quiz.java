package org.launchcode.quiz;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    Integer userScore = 0;
    ArrayList<Question> quizQuestions = new ArrayList<>();

    ArrayList<Question> missedQuestions = new ArrayList<>();

    public void addQuestion(Question aQuestion){
        quizQuestions.add(aQuestion);

    }


    public void startQuiz(){
        Scanner scanny = new Scanner(System.in);
        for (Question question : quizQuestions) {
            question.printQuestion();
            System.out.print("Enter your answer: ");
            question.userAnswer = scanny.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
            System.out.println("");

        }
        gradeQuiz();
        System.out.println("Your score was " + userScore + " out of " + quizQuestions.size());
        if (userScore == quizQuestions.size()){
            System.out.println("Awesome you got all the answers correct!");
        } else {
            System.out.println("You missed the following question(s):");
            for (Question missedQuestion : missedQuestions ) {
                missedQuestion.printQuestion();
                System.out.print("The correct answer is: ");
                for (String correctAns : missedQuestion.correctAnswer){
                    System.out.print(correctAns + " ");
                }
                System.out.println("");
            }
        }

    }

    public void gradeQuiz(){
        for (Question question : quizQuestions) {

            if (question.correctAnswer.size() == 1) {
                if (question.correctAnswer.contains(question.userAnswer)){
                    userScore++;
                } else {
                    missedQuestions.add(question);
                }

            } else {
                Integer tempCorrectAnswer = 0;
                String[] userAnswerArray = question.userAnswer.split("");
                for (String userAnswer : userAnswerArray){
                    if(question.correctAnswer.contains(userAnswer)){
                        tempCorrectAnswer++;
                    }
                }
                if (tempCorrectAnswer == question.correctAnswer.size()){
                    userScore++;
                } else {
                    missedQuestions.add(question);
                }

            }
        }
    }
}
