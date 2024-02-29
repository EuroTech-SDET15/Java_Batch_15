package day51.vehicle;

public enum ToyotaModels {

    CORALLA(10000), AVENSIS(13000), YARIS(8000),
    PRIUS(12000), RAV4(14000), CAMRY(16000);
    //10000    13000  8000   12000  14000  16000

    double price;

    ToyotaModels(double value) {
        this.price = value;
    }


}
