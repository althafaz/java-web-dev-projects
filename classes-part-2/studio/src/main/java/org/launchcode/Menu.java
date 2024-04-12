package org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class Menu {
    private LocalDate lastUpdated;
    private  ArrayList<MenuItem> items;

    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        lastUpdated = d;
        items = i;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(LocalDate d,MenuItem m){

        if(items.stream().anyMatch(row->row.getDescription().equals(m.getDescription()))){
            System.out.println("Duplicate menu item, please enter a new menu item");
        }

        else {
            lastUpdated = d;
            items.add(m);
        }

    }

    public  void removeItem(MenuItem item){
        System.out.println(items.remove(item));
    }

    public void displayMenuItem () {
        System.out.println("Updated Date:" + lastUpdated);
    }

    public void welcomeMenu (){
        
        Scanner option = new Scanner(System.in);
        System.out.println("Welcome to Le restaurante");
        System.out.println();
        System.out.println("Please choose how do you like to view the menu");
        System.out.println("To view the entire menu please enter 0 " +
                "or to view individual menu items by category please enter 1:");
        int selectedOpt = option.nextInt();

        if(selectedOpt == 0){
            System.out.println("...........................................\n");
            System.out.println("----------Le Resturante Menu----------\n");
            System.out.println("............................................");
            for(MenuItem item : items){
                System.out.println("\nMenu Item: " + item.getDescription());
                System.out.println("Price: "+item.getPrice());
                System.out.println("Category: "+item.getCategory());
                final boolean days = (30 > ChronoUnit.DAYS.between(item.getAddedDate(),LocalDate.now()));
                if(days) {
                    System.out.println("Is this Menu Newly Added ? [Yes]");
                }
                else {
                    System.out.println("Is this Menu Newly Added ? [No]");
                }

                System.out.println("Date added: "+item.getAddedDate()+"\n");
                System.out.println("******************************");
            }
        }

        else {

            System.out.println("Please enter a category Number to view the Menu Items");
            System.out.println("1. Appetizer | 2. Main Course | 3. Dessert ? ");
            int selectedCat = option.nextInt();

            final String selectedCategory;

            if(selectedCat == 1){
                selectedCategory = "appetizer";
            }
            else if(selectedCat == 2){
                selectedCategory = "main course";
            }

            else if(selectedCat == 3){
                selectedCategory = "dessert";
            }
            else {
                selectedCategory = "";
                System.out.println("invalid input");
                welcomeMenu();
            }


            if(selectedCat <= 3 && selectedCat >0){
                String finalSelectedCategory = selectedCategory;
                System.out.println("...........................................\n");
                System.out.println("----------"+selectedCategory+"'s----------\n");
                System.out.println("............................................");
                items.stream().filter(menuItem -> menuItem.getCategory() == finalSelectedCategory).forEach(item-> {
                    System.out.println("\nMenu Item: " + item.getDescription());
                    System.out.println("Price: "+item.getPrice());
                    final boolean days = (30 > ChronoUnit.DAYS.between(item.getAddedDate(),LocalDate.now()));
                    if(days) {
                        System.out.println("Is this Menu Newly Added ? [Yes]");
                    }
                    else {
                        System.out.println("Is this Menu Newly Added ? [No]");
                    }

                    System.out.println("Date added: "+item.getAddedDate()+"\n");
                    System.out.println("******************************");

                        }

                );

            }

        }
    }

}


