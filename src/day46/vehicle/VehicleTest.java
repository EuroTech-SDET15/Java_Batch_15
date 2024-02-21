package day46.vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        //there are 2 ways to create vehicle object
        //one of them with 2 arguments, one of them without any arg
        Vehicle vehicle = new Vehicle("Car", 4);
        Vehicle vehicle2 = new Vehicle();

        System.out.println(vehicle.toString());

//      child sub derived
        Car car = new Car("BMW", 4, 20000);
        car.start();
        car.handBreak();
        //car.brand = "BMW";
        System.out.println("car.brand = " + car.brand);
        System.out.println("car.seats = " + car.seats);
        System.out.println("car.value = " + car.value);
        car.hadAccident("medium");
        System.out.println("car.value = " + car.value);

        Plane plane = new Plane();
        plane.name = "Boeing";
        plane.seats = 200;
        plane.wingspan = 60.93;
        plane.start();
        plane.move();//  boeing is moving and  has taken off.
        car.name = "Car";
        car.move();
        Vehicle.beingRepaired();
        Plane.beingRepaired();

        //number of vehicles
        //  4
        System.out.println("Vehicle.counter = " + Vehicle.counter);
        //static variable created only once and belong to class
//Toyota extends Car extends Vehicle
// Grandchild
        Toyota toyota = new Toyota();
        toyota.seats = 5;//Vehicle
        toyota.brand = "Toyota";//Car
        toyota.model = "Avensis";//Toyota
        toyota.start();
        toyota.clean("");
        System.out.println(toyota.toString());


    }
}
