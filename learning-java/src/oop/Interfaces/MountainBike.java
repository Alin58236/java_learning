package oop.Interfaces;

public class MountainBike implements Bicycle{

    int speed;

    public MountainBike(int speed){
        this.speed=speed;
        System.out.println("Created "+this.getClass().getSimpleName()+" with speed = "+ this.speed);
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }
}
