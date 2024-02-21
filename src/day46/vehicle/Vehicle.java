package day46.vehicle;

public class Vehicle {

    String name;
    int seats;

    static int counter;

    Vehicle(String vehicleName, int vehicleSeat) {
        this.counter++;
        this.name = vehicleName;
        this.seats = vehicleSeat;
    }

    Vehicle() {
        this.counter++;
        System.out.println("1 vehicle created.");
    }


    public static void beingRepaired() {
        System.out.println("Vehicle is being repaired.");
    }

    public void start() {
        System.out.println(this.name + " started.");
    }

    public void stop() {
        System.out.println("v ehicle stopped.");
    }

    public void move() {
        System.out.println(name + " is moving.");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", seats=" + seats +
                '}';
    }
}
