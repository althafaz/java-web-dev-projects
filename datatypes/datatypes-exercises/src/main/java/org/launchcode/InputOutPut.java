package org.launchcode;

import java.util.Scanner;
public class InputOutPut {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, What is your name: ");
        String name = input.next();
        input.close();
        System.out.println("Hello "+ name);
    }
}
