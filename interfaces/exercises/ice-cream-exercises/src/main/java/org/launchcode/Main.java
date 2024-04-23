package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
        System.out.println("\nSorted Flavours");
        flavors.stream().forEach(x->{
            System.out.println(x.getName());
        });
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        Comparator comparator1 = new ConeComparator();
        cones.sort(comparator1);
        System.out.println("\nSorted Cones");
        cones.stream().forEach(x->{
            System.out.println(x.getCost());
        });

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("\nCone Menu");
        cones.stream().forEach(x->{
            System.out.println(x.getName()+ " | Price: " + x.getCost());
        });

        System.out.println("\nFlavor Menu");
        flavors.stream().forEach(x->{
            System.out.println(x.getName()+ " | Price: " + x.getCost());
        });
    }
}