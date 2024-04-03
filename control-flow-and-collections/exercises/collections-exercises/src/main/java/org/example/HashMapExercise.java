package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExercise {

    public static void  main (String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        int id;
        HashMap<Integer, String> students = new HashMap<>();


        do {
            System.out.print("Please enter student name: ");
            name = input.nextLine();

            if (!name.isEmpty()) {
                System.out.print("Please enter student ID: ");
                id = input.nextInt();
                students.put(id, name);

                input.nextLine();
            }
        }

        while (!name.isEmpty());

        input.close();

        for(Map.Entry<Integer,String> student : students.entrySet()) {
            System.out.println("Student ID: "+ student.getKey() + "   |  Student Name: " + student.getValue());
        }

        System.out.println("Number of students in roster: " + students.size());
    }
}
