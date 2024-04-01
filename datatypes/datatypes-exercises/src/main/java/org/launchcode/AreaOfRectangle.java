package org.launchcode;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle width: ");
        double width = input.nextDouble();

        System.out.println("Rectangle length: ");
        double length = input.nextDouble();
        input.close();

        System.out.println("Area of Rectangle is " + (width * length));

    }
}
