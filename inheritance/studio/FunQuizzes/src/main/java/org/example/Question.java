package org.example;

import java.util.Scanner;

public abstract class Question {
    private String question;

    public Question(String quest) {
            question = quest;
    }

    public abstract void displayUserQuestionsAndChoices();
    public String getQuestion() {
        return question;
    }

    public abstract void getAnswersFromUser();

    public abstract double gradingAnswers();
}
