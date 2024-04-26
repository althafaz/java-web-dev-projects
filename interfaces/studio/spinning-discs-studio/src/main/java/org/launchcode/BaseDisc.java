package org.launchcode;

public abstract class BaseDisc implements OpticalDisc{

    private double storageCapacity;
    private String name;
    private double capacity;
    private String contents;

    public BaseDisc(double storageCapacity, String name, double capacity, String contents) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
    }
}
