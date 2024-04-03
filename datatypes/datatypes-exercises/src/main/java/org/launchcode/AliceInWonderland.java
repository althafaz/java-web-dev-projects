package org.launchcode;

import java.util.Scanner;
public class AliceInWonderland {

    public static void main(String[] args){

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the term you're looking for: ");
        String termStr = input.next();

        System.out.println(sentence.toLowerCase().contains(termStr.toLowerCase()));

        int index = sentence.toLowerCase().indexOf(termStr.toLowerCase());

        System.out.println("Start at index: " + index +" and the length is " + termStr.length() );

        String removeTheTerm = sentence.toLowerCase().replaceAll(termStr,"");

        System.out.println(removeTheTerm);

        input.close();
    }
}
