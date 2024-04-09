package org.launchcode;

import java.util.Date;

public class MenuItem {
    private static int menuId=1;
    private double price;
    private  String description;
    private String category;
    private String[] categoryList = {"Appetizer","Main Course","Dessert"};
    private boolean isMenuItemNew;
    Date addedDate;


    public MenuItem(double price,String description, String category, boolean isMenuItemNew,Date addedDate){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isMenuItemNew = isMenuItemNew;
        this.addedDate = addedDate;
    }

    public String displayMenuItem () {
        return category;
    }

}





