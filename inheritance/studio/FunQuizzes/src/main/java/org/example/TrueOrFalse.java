package org.example;

import java.util.Scanner;

public class TrueOrFalse extends Question{

    private static  boolean isCorrectAns,IsUserAns;
    private static int userAns;
    public TrueOrFalse(String quest, Boolean corrAns) {
        super(quest);
        isCorrectAns = corrAns;
    }

    @Override
    public void displayUserQuestionsAndChoices() {
        System.out.println(super.getQuestion());
        getAnswersFromUser();
    }

    @Override
    public void getAnswersFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 1 for true 0 for  false: ");
        int userSelected = input.nextInt();

        if(userSelected == 1){
            IsUserAns = true;
        }

        else if(userSelected == 0){
            IsUserAns = false;
        }

    }

    @Override
    public double gradingAnswers() {

        if(IsUserAns == isCorrectAns){
            return 1;
       }
        return 0;
    }
}
