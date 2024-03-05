package day54;

public abstract class Vehicle {
    String brand;
    int year;

    public void move() {
        System.out.println("Vehicle is moving.");
    }
    public void stop(){
        System.out.println("Vehicle stopped.");
    }
}
