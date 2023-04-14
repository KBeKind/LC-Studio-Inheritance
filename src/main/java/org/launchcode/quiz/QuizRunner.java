package org.launchcode.quiz;

import java.util.ArrayList;

public class QuizRunner {

    public static void main(String[] args) {

        ArrayList<String> question1Options = new ArrayList<>();
        question1Options.add("True");
        question1Options.add("False");
        ArrayList<String> question1CorrectAnswer = new ArrayList<>();
        question1CorrectAnswer.add("A");
        Question question1 = new TrueFalse("Answer True or False for this question: ", question1Options, question1CorrectAnswer );

        ArrayList<String> question2Options = new ArrayList<>();
        question2Options.add("Wrong");
        question2Options.add("Right");
        question2Options.add("Wrong");
        question2Options.add("Wrong");
        ArrayList<String> question2CorrectAnswer = new ArrayList<>();
        question2CorrectAnswer.add("B");
        Question question2 = new MultipleChoice("Answer just one for this question: ", question2Options, question2CorrectAnswer );

        ArrayList<String> question3Options = new ArrayList<>();
        question3Options.add("Right");
        question3Options.add("Wrong");
        question3Options.add("Right");
        question3Options.add("Wrong");
        ArrayList<String> question3CorrectAnswer = new ArrayList<>();
        question3CorrectAnswer.add("A");
        question3CorrectAnswer.add("C");
        Question question3 = new Checkbox("Answer more than one for this question: ", question3Options, question3CorrectAnswer );


        Quiz quiz1 = new Quiz();
        quiz1.addQuestion(question1);
        quiz1.addQuestion(question2);
        quiz1.addQuestion(question3);

        quiz1.startQuiz();
    }
}
