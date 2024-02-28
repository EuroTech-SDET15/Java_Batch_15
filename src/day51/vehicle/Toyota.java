package day51.vehicle;

public class Toyota extends Car {

    //    String model;
    ToyotaModels toyotaModel;


    Toyota(ToyotaModels models) {
        super(Brands.TOYOTA);
        toyotaModel = models;
        super.value = models.price;
    }
    //Corolla,Avensis,Yaris,Prius,Rav4,Camry


    @Override
    public String toString() {
        return "Toyota{" +
                "toyotaModel=" + toyotaModel +
                ", year=" + year +
                ", brand=" + brand +
                ", value=" + value +
                '}';
    }
}
