package day23;

public class CarTest {
    public static void main(String[] args) {
        //create  2 object from Car class
        Car superCar = new Car();
        superCar.start();

        Car hondaCivic = new Car();

        hondaCivic.color = "White";
        hondaCivic.brand = "Honda";
        hondaCivic.regYear = 2015;


        Car kiaNiro = new Car();
        kiaNiro.color = "Grey";
        kiaNiro.brand = "Kia";
        kiaNiro.regYear = 2018;
    }
}
