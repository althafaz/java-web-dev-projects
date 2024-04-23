package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Checkbox extends Question {
    private static ArrayList<String> selectedAns = new ArrayList<>();
    private static ArrayList<String> multipleAnswers;

    private static ArrayList<String> correctAnswers = new ArrayList<>();

    public Checkbox(String quest,ArrayList<String> multiAns,String [] corrAns) {
        super(quest);
        multipleAnswers = multiAns;
        correctAnswers = new ArrayList<>(Arrays.asList(corrAns));
    }

    @Override
    public void displayUserQuestionsAndChoices() {
        System.out.println(super.getQuestion());
        int increment = 0;
        for(String choice : multipleAnswers ){
            increment++;
            System.out.println(increment + ": "+ choice);
        }

        getAnswersFromUser();
    }
    @Override
    public void getAnswersFromUser() {
        Scanner input = new Scanner(System.in);
        while (selectedAns.size() < multipleAnswers.size()) {
            System.out.print("Please enter the number of the Answer: ");
            System.out.print("Please enter the number 0 to continue to next question: ");
            int selectedNos = input.nextInt();
            if(selectedNos <= multipleAnswers.size() && selectedNos > 0)
            {
                selectedAns.add(multipleAnswers.get(selectedNos-1));
                System.out.println("Added:"+ multipleAnswers.get(selectedNos-1));
            }
            else if(selectedNos == 0 || selectedAns.size() < multipleAnswers.size()){
                break;
            }

            else {
                System.out.print("Invalid input,Please enter a valid value:" );
            }
        }
    }

    @Override
    public double gradingAnswers() {
        double points = 0;
        double getCorrectAnswerNumbers = correctAnswers.size();
        double gradeForOneCorrectAns = 1 /getCorrectAnswerNumbers;
        for(String ans : selectedAns){
            if(correctAnswers.contains(ans)){
                points += gradeForOneCorrectAns;
            }

        }
        return points;
    }
}
