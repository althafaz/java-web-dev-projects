package org.launchcode;

import java.time.LocalDate;
import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private LocalDate addedDate;
    public MenuItem(double p, String d, String c, boolean iN,LocalDate aDate) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
        this.addedDate = aDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }
}

