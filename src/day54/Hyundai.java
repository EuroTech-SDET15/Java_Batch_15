package day54;

public class Hyundai extends Car implements ElectricCar{
    @Override
    public void chargeBattery() {
        System.out.println("Before 150 mile charge the battery.");
    }

    @Override
    public void changeBattery() {
        System.out.println("Change the battery after 10 years.");
    }
}
