package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayArrayList {
    public static void main(String[] args) {
        //Array practice
        int[] numbers = {1,1,2,3,5,8};

        String text = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse";

        String[] words = text.split(" ");

        for(int i : numbers){
            if(i%2 == 1){
                System.out.println(i);
            }
        }

        for (String i : words) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(words));

        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));

        //ArrayList Practice
        ArrayList<Integer> numOfArr = new ArrayList<>();

        for(int i=1;i < 10;i++){
            numOfArr.add(i);
        }

        System.out.println("Sum of even numbers : " + sumOfArrayList(numOfArr));

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Hello");
        wordList.add("Apple");
        wordList.add("Orange");
        wordList.add("Cat");
        wordList.add("Moon");

        System.out.println(fiveLetters(wordList));

        for(String i : fiveLetters(wordList)){
            System.out.println(i);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of letter : ");
        int num = input.nextInt();

        if(num > 0){
            for(String i : lettersFilerByUser(wordList,num)){
                System.out.println(i);
            }
        }

        else {
            System.out.println("Enter a valid number");
        }


        //Bonus Mission
        ArrayList<String> wordsListFromText = new ArrayList<>(Arrays.asList(words));

        System.out.println("Please enter the number of letter : ");
        int numFromUser = input.nextInt();

        if(numFromUser > 0){
            for(String i : lettersFilerByUser(wordsListFromText,numFromUser)){
                System.out.println(i);
            }
        }

        else {
            System.out.println("Enter a valid number");
        }
    }

    public static int sumOfArrayList (ArrayList<Integer> numArr){

        int sum = 0;
        for (Integer x : numArr) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        return sum;
    }

    public static ArrayList<String> fiveLetters (ArrayList<String> wordsList) {

        ArrayList<String> wordsArrList = new ArrayList<>();
        for(String w : wordsList) {
            if(w.length() == 5 ) {
                wordsArrList.add(w);
            }
        }

        return wordsArrList;
    }

    public static ArrayList<String> lettersFilerByUser (ArrayList<String> wordsList, int userInput) {

        ArrayList<String> wordsArrList = new ArrayList<>();
        for(String w : wordsList) {
            if(w.length() == userInput ) {
                wordsArrList.add(w);
            }
        }

        return wordsArrList;
    }
}