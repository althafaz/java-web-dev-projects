package org.launchcode;

import java.util.Scanner;
public class CalMilesPerGallon {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Number of miles driven: ");
        double miles = input.nextDouble();

        System.out.println("Amount of gas consumed: ");
        double gas = input.nextDouble();

        System.out.println("Miles per Gallon is: " + (miles/gas) );
        input.close();

    }
}
