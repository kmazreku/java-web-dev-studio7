package org.launchcode.studio7;

public class FloppyDisk extends BasicDisc implements OpticalDisc{

    public FloppyDisk(String rpm){
        super(rpm);
    }

    @Override
    public void spinDisc() {
        System.out.println("A Floppy Disk spins at a rate of "+ this.rpm +"rpm.");
    }
}
