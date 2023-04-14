package org.launchcode.quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

abstract class Question {
    Integer questionId;
    static Integer nextQuestionId = 1;
    String questionTextPrompt;
    ArrayList<String> questionAnswerOptions;
    ArrayList<String> correctAnswer;

    String userAnswer;

   String[] questionLetters;

    public Question(String aQuestionTextPrompt, ArrayList<String> aQuestionAnswerOptions, ArrayList<String> aCorrectAnswer) {
        this.questionTextPrompt = aQuestionTextPrompt;
        this.questionAnswerOptions = aQuestionAnswerOptions;
        this.correctAnswer = aCorrectAnswer;
        this.questionId = nextQuestionId;
        nextQuestionId++;
        this.questionLetters = new String[]{"A. ", "B. ", "C. ", "D. "};

    }


    public void printQuestion(){

        System.out.println(questionId + ". " + questionTextPrompt);
        for (int i = 0; i < questionAnswerOptions.size(); i++ ) {
            System.out.println("    " + questionLetters[i] + questionAnswerOptions.get(i));
        }



    }
}
