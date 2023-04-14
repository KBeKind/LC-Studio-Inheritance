package org.launchcode.quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultipleChoice extends Question {
    public MultipleChoice(String aQuestionTextPrompt, ArrayList<String> aQuestionAnswerOptions, ArrayList<String> aCorrectAnswer) {
        super(aQuestionTextPrompt, aQuestionAnswerOptions, aCorrectAnswer);
    }
}
