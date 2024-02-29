package day51.vehicle;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(Brands.BMW);
        Car car1 = new Car(Brands.TOYOTA);
        System.out.println(car1.toString());
        System.out.println(car.toString());

        Toyota toyota = new Toyota(ToyotaModels.CORALLA);
        System.out.println(toyota.toString());
        System.out.println("ToyotaModels.CORALLA.price = " + ToyotaModels.CORALLA.price);
        System.out.println("ToyotaModels.AVENSIS.price = " + ToyotaModels.AVENSIS.price);
        System.out.println("toyota.toString() = " + toyota.toString());

        Toyota toyota1=new Toyota(ToyotaModels.YARIS);
        System.out.println(toyota1.toString());


        //Driver accept car  --->  driver drives Brands

        //create an enum class for days of the week
        //months    -->  february is the second month of the week



    }
}
