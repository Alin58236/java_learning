package oop.inheritance;

public class InheritanceDemo {

    public static void main(String[] args){
        MountainBike mountainBike = new MountainBike(20,10,1);
        System.out.println("Gear is " + mountainBike.gear);
        System.out.println("Seat Height is " + mountainBike.seatHeight);
        System.out.println("Bike speed is " + mountainBike.speed);

        mountainBike.applyBrake(2);

        System.out.println("Bike speed is " + mountainBike.speed);

        mountainBike.speedUp(44);

        System.out.println("Bike speed is " + mountainBike.speed);

        // Inheritance represents an is-a relationship

        // eg. MountainBike is a type of Bicycle (behaves the same even if it may have a few more attributes and methods

    }
}
