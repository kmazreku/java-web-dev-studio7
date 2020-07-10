package org.launchcode.studio7;

public class DVD extends BasicDisc implements OpticalDisc{

    // TODO: Implement your custom interface.
    public DVD(String rpm){
        super(rpm);
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of "+ this.rpm +"rpm.");
    }
}
