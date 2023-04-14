package org.launchcode.quiz;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    ArrayList<Question> quizQuestions = new ArrayList<>();

    public void addQuestion(Question aQuestion){
        quizQuestions.add(aQuestion);

    }


    public void startQuiz(){
        Scanner scanny = new Scanner(System.in);
        for (Question question : quizQuestions) {
            question.printQuestion();
            System.out.print("Enter your answer: ");
            question.userAnswer = scanny.nextLine().toUpperCase();
            System.out.println("");

        }
        System.out.println(gradeQuiz());

    }

    public int gradeQuiz(){
        int score = 0;
        for (Question question : quizQuestions) {
            if(question.correctAnswer.equals(question.userAnswer)){
                score++;
            }
        }
        return score;
    }
}
