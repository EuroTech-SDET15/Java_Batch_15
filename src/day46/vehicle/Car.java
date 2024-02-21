package day46.vehicle;

public class Car extends Vehicle {
    String brand;
    String color;

    double value;

    Car() {

    }

    public void clean(String brand){
        System.out.println(this.brand+" is being washed.");
    }


    Car(String brand, int seat, double val) {
        this.brand = brand;
        super.seats = seat;
        this.value = val;
        System.out.println("1 Car object created.");

    }






    public void handBreak() {
        System.out.println("Car stopped.");
    }

    public void hadAccident(String accident) {
        if (accident.equals("small")) {
            this.value = this.value - 3000;
        } else if (accident.equals("medium")) {
            this.value = this.value - 5000;
        } else if (accident.equals("big")) {
            this.value = this.value - 7000;
        }
    }


}
