package org.congestion;

public class RaceCar1 implements InterfaceCar {
    int fuelLevel = 0;

    @Override
    public void fuel() {
        this.fuelLevel = 10;
    }

    @Override
    public void startIgnition() {
        fuelLevel = 9;
        System.out.println("Car started!");

    }

    @Override
    public void setGear() {
        System.out.println("Switching to gear '1'");

    }

    @Override
    public void accelerate() {

    }
}
   /* @Override
    public void rotateWheel() {
        System.out.println("Has complex square wheel");
    }

    @Override
    public void checkPanel() {
        System.out.println("Has complex panel");
    }

    @Override
    public void switchGear() {
        System.out.println("Has manual gear");
    }

    @Override
    public void checkPedals() {
        System.out.println("Has three pedals");
    }*/

