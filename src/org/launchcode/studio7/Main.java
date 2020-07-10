package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("200 - 500");
        DVD dvd = new DVD("570 - 1600");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        dvd.spinDisc();
    }
}
