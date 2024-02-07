package day37;

import java.util.Map;

public class Circle {

    // Data fields - instance fields - belong to the class
    double radios;
    String circleName;
    String shape;

    // Constructor
    // (No return type,same Name with Class)
    public Circle(){
        System.out.println("--Constructor Method Run--");
        shape = "Circle";
    }

    public Circle(double radios){
        System.out.println("\n--Parameterize Constructor Method Run--");
        shape = "Circle";
        this.radios = radios;
    }


    // Functions -actions
    public double getArea() {
        return Math.PI * radios * radios;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radios;
    }

    public void setRadios(double radios) {
        this.radios = radios;
    }
}
