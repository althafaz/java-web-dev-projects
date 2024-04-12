package org.launchcode;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<MenuItem> menuItemsList = new ArrayList<>();

        LocalDate dateUpdatedOrInserted = LocalDate.now();
        LocalDate olderThanSevenDays = LocalDate.now().minusDays(50);

        MenuItem itemOne = new MenuItem(18.50,"Salmon with Brown Sugar Glaze","main course",true,olderThanSevenDays);
        MenuItem itemTwo = new MenuItem(15.50,"Pesto Cheesy Chicken Rolls","main course",true,dateUpdatedOrInserted);
        MenuItem itemFour = new MenuItem(9.50,"Savory Party Bread","appetizer",true,dateUpdatedOrInserted);
        MenuItem itemFive = new MenuItem(12.50,"Fruit Charcuterie Board","appetizer",true,dateUpdatedOrInserted);
        MenuItem itemSix = new MenuItem(5.50,"Cheesecake","dessert",true,dateUpdatedOrInserted);
        MenuItem itemSeven = new MenuItem(7.50,"Tiramisu","dessert",true,dateUpdatedOrInserted);

        menuItemsList.add(itemOne);
        menuItemsList.add(itemTwo);
        menuItemsList.add(itemFour);
        menuItemsList.add(itemFive);
        menuItemsList.add(itemSix);
        menuItemsList.add(itemSeven);

        Menu restMenu = new Menu(dateUpdatedOrInserted,menuItemsList);

        System.out.println(dateUpdatedOrInserted);

        MenuItem itemThree = new MenuItem(14.50,"Spicy Lime Grilled Shrimp","main course",true,dateUpdatedOrInserted);
        MenuItem itemEight = new MenuItem(14.50,"Spicy Lime Grilled Shrimp","main course",true,dateUpdatedOrInserted);
        restMenu.addItem(dateUpdatedOrInserted,itemThree);
        restMenu.addItem(dateUpdatedOrInserted,itemEight);
        //System.out.println(restMenu.getItems().get(0).getDescription());
        //restMenu.removeItem(itemOne);
        //System.out.println(restMenu.getItems().get(0).getDescription());
        restMenu.displayMenuItem();

        restMenu.welcomeMenu();

    }

}
