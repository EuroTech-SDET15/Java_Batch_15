package day46.vehicle;

public class Plane extends Vehicle {

    double wingspan;//the maximum extent across the wings of an aircraft

    //i will define move method in the child class again
    //signature of the method must be same
    public void move() {
        System.out.println(super.name + " is moving and  has taken off.");
    }


}
