package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD xyZ = new CD(700,"XYZ",500,"Music");
        DVD soundOfFreedom = new DVD(4500,"Sound of freedom",4000,"Movie");


        // TODO: Call each CD and DVD method to verify that they work as expected.
        displayAllListsByType(xyZ);
        displayAllListsByType(soundOfFreedom);
    }


    public static void displayAllListsByType(BaseDisc type){
        OpticalDisc oD = type;
        System.out.println(oD.getDiscType());
        oD.readData(600,50);
    }
}