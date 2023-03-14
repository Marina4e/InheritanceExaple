package org.congestion;

public class Tesla1 implements InterfaceCar{
    private float chargeLevel = 0.0F;
    @Override
    public void fuel() {
        chargeLevel = 100F;
    }

    @Override
    public void startIgnition() {
        System.out.println("Tesla has no ignition");
    }

    @Override
    public void setGear() {
        System.out.println("Tesla has no gear");
    }

    @Override
    public void accelerate() {

    }
}
   /* @Override
    public void rotateWheel() {
        System.out.println("Tesla has a round wheel");
    }

    @Override
    public void checkPanel() {
        System.out.println("Tesla has a cool panel");
    }

    @Override
    public void switchGear() {
        System.out.println("Has no gear,it's electric");
    }

    @Override
    public void checkPedals() {
        System.out.println("Has only break and acceleration");
    }
}*/
