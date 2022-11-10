package oop.Interfaces;

public class InterfacesDemo {

    //Interfaces are classes with constants and declarations of methods (but no implementation)
    // they help by fixing the problem of multiple inheritances (eg. one class extends 2 superclasses)

    public static void main(String[] args) {
        Bicycle b= new MountainBike(25);

        b.applyBrake(14);
        System.out.println(b.getSpeed());

    }
}
