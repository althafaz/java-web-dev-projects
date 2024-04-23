package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(double storageCapacity,String name, double capacity, String contents) {
        super(storageCapacity,name, capacity, contents);
    }

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void writeData(double discMemory, double writingSpeed) {
        System.out.println("Writing Speed is: "+writingSpeed +"MB/s , Disc Memory: "+ discMemory+" MB");
    }

    @Override
    public void readData(double disMemory, double readingSpeed) {
        System.out.println("Reading Speed is: "+readingSpeed +"MB/s , Disc Memory: "+ disMemory+" MB");
    }

    @Override
    public String getDiscType() {
        return "CD";
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
