package day46.vehicle;

//public class Toyota  extends Car,Plane {  Class cannot extend multiple classes
public class Toyota extends Car {
    //   Toyota is a car

    String model;


    public void start() {
        System.out.println("Toyota started by contactless.");//without key
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", value=" + value +
                ", name='" + name + '\'' +
                ", seats=" + seats +
                '}';
    }
}
