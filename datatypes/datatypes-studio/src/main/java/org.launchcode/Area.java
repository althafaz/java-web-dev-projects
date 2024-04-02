package org.launchcode;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Area {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = 0;


        while(radius <= 0) {
           try {
               System.out.print("Radius of the circle: ");
               radius = input.nextDouble();

                if(radius > 0 ){
                    double calArea = Circle.getArea(radius);
                    System.out.println("Area of circle is " + calArea);
                }

            } catch (InputMismatchException e) {
                System.out.println("Double value is not value");
                main(args);
            }
        }
    }

}
