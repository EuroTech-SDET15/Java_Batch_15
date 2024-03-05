package day54;

public class Tesla extends Car implements ElectricCar{


    @Override
    public void chargeBattery() {
        System.out.println("Charging tesla.");
    }

    @Override
    public void changeBattery() {
        System.out.println("After 5 or 200000 mile changing battery.");
    }
}
