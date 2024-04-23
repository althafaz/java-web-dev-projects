package org.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            ArrayList<String> choices = new ArrayList<>();
            ArrayList<Question> allQuestions = new ArrayList<>();
            choices.add("Barak Obama");
            choices.add("Donald trump");
            choices.add("George Washington");
            Question quest1 = new MultipleChoice("Who is the First President of USA? ",choices,"George Washington");

            ArrayList<String> choicesOne = new ArrayList<>();
            choicesOne.add("Each state has its own capital city");
            choicesOne.add("States have their own unique flag designs");
            choicesOne.add("States can have different time zones");

            String [] CorrectAnswers = {"Each state has its own capital city","States have their own unique flag designs"};
            Question quest2 = new Checkbox("Which of the following are characteristics of states in the United States?",choicesOne,CorrectAnswers);
            Boolean corAns = true;
            Question quest3 = new TrueOrFalse("The Atlantic Ocean is the largest ocean on Earth. True or False ?",corAns);
            allQuestions.add(quest1);
            allQuestions.add(quest2);
            allQuestions.add(quest3);

           double grade = 0;
           int numOfQuest = allQuestions.size();
            for(Question quest : allQuestions){
                quest.displayUserQuestionsAndChoices();
                grade += quest.gradingAnswers();
            }

           System.out.println("Your result is:" + grade + " out of "+numOfQuest);

    }

}