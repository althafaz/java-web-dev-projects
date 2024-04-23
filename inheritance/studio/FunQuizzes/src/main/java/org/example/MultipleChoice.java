package org.example;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MultipleChoice extends Question{

    private ArrayList<String> multipleChoices;
    private int  usersAnswer = 0;

    private String correctAnswer;
    public MultipleChoice(String quest, ArrayList<String> choices,String corAns) {
        super(quest);
        multipleChoices = choices;
        correctAnswer = corAns;
    }

    @Override
    public void displayUserQuestionsAndChoices() {
        System.out.println(super.getQuestion());
            int increment = 0;
        for(String choice : multipleChoices ){
            increment++;
            System.out.println(increment + ": "+ choice);
        }
        getAnswersFromUser();
    }

    @Override
    public void getAnswersFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of the Answer: ");
        if(usersAnswer < multipleChoices.size()) {
            usersAnswer = input.nextInt();
        }
        else {
            usersAnswer = input.nextInt();
        }
    }

    @Override
    public double gradingAnswers() {

        if(multipleChoices.get(usersAnswer-1).equals(correctAnswer)) {
            return 1;
        }
        return 0;
    }
}
