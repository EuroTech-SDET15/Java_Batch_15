package day54;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestVehicle {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.move();
        Train train = new Train();
        train.move();
        Car car = new Car();
        car.move();
        Bicycle bicycle = new Bicycle();
        Vehicle vehicle = new Bicycle();
        vehicle.move();
        vehicle = new Car();
        vehicle.move();
        vehicle = new Plane();
        vehicle.move();
        vehicle = new Train();
        vehicle.move();

        // racers={train,car,plane,bicycle};
        Car car1 = new Car();
        Car car2 = new Car();
        Train train1 = new Train();
        int[] carNumber = {10, 20, 30};
        Car[] cars = {car1, car2};

        Vehicle[] vehicles = {car1, train1, bicycle, plane};

//reference maybe from Class,Abstract Class or Interface
        Vehicle vehicle1 = new Train();
        train1.brand = "Express";
        car2.brand = "Ferrari";
        plane.brand = "Boeing";
        bicycle.brand = "Trex";
        callVehicle(train1);
        callVehicle(car2);
        callVehicle(plane);
        callVehicle(bicycle);

        ArrayList<Integer> numbers = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        //reference type from parent class,interface=  object type from child
        Vehicle vehicle2 = new Bicycle();
        List<Integer> list1 = new ArrayList<>();
        print(numbers);
        print(list);

        String str = new String("");

        Hyundai hyundai = new Hyundai();
        ElectricCar electricCar1 = new Hyundai();
        Tesla tesla = new Tesla();
        ElectricCar electricCar2 = new Tesla();

        ArrayList<ElectricCar>  myElectricCars=new ArrayList<>();
        myElectricCars.add(electricCar1);
        myElectricCars.add(electricCar2);




    }

    public static void callVehicle(Vehicle vehicle) {
        System.out.println(vehicle.brand);
    }

    public static void print(List<Integer> list) {
        System.out.println("list = " + list);
    }
//    public static void print(LinkedList<Integer> list){
//        System.out.println("list = " + list);
//    }
//
//    public static void print(ArrayList<Integer>list){
//        System.out.println("list = " + list);
//    }

//    public void callVehicle(Bicycle bicycle) {
//        System.out.println(bicycle.brand);
//    }
//
//    public void callVehicle(Train train) {
//        System.out.println(train.brand);
//    }
//
//    public void callVehicle(Car car) {
//        System.out.println(car.brand);
//    }

    public void callVehicle(String s) {

    }
}
