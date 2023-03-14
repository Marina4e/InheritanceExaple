package org.congestion;

public class DriveCar {
    public static void main(String[] args) {
        driveTest(new Tesla1());
        driveTest(new RaceCar1());
    }
    public static void driveTest(InterfaceCar interfaceCar){
        interfaceCar.fuel();
        interfaceCar.startIgnition();
        interfaceCar.setGear();
        interfaceCar.accelerate();
    }
}
