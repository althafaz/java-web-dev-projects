package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." +
                    " So if you move all the terms over to one side, you can put the quadratics into a form " +
                    "that can be factored allowing that side of the equation to equal zero. " +
                    "Once you’ve done that, it’s pretty straightforward from there.";

        //char[] charactersInString = text.toLowerCase().toCharArray();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text:" );

        String textFromUser = input.nextLine();

        displayFinalOutPut(textFromUser);
//        for(Map.Entry<Character, Integer> letter : findNumOfChar(textFromUser).entrySet()){
//            System.out.println(letter);
//        }
        System.out.println("....................................");
        displayFinalOutPut(text);
//        for(Map.Entry<Character, Integer> letter : findNumOfChar(text).entrySet()){
//            System.out.println(letter);
//        }

    }

    public static void displayFinalOutPut(String str) {
        for(Map.Entry<Character, Integer> letter : findNumOfChar(str).entrySet()){
            System.out.println(letter);
        }
    }
    public static HashMap<Character, Integer> findNumOfChar (String str) {

        HashMap <Character, Integer> count = new HashMap<>();
        char[] charInUserText = str.replaceAll("[^a-zA-Z]+", " ").trim().toLowerCase().toCharArray();

        for(char c : charInUserText) {
            if(count.containsKey(c)) {
                int num = count.get(c) + 1;
                count.replace(c,num);
            }

            else {
                count.put(c,1);
            }
        }
        return count;
    }

    public static void readFromFile (){

    }
}