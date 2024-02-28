package day51.vehicle;

public class Car {

    int year = 2024;
    //    String brand;
    Brands brand;

    double value;

    Car(Brands brand) {
        this.brand = brand;
    }
    // Toyota,Honda,BMW,Mercedes,Mazda


    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand=" + brand +
                '}';
    }
}
