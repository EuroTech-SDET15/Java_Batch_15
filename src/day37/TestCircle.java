package day37;

public class TestCircle {

    public static void main(String[] args) {

         Circle circleA=new Circle();

        System.out.println("circleA.radios = " + circleA.radios);
        System.out.println("circleA.circleName = " + circleA.circleName);
        System.out.println("circleA.shape = " + circleA.shape);

        circleA.setRadios(10);
        System.out.println("circleA.radios = " + circleA.radios);
        System.out.println("circleA.getPerimeter() = " + circleA.getPerimeter());


        Circle circleB=new Circle(2);
        System.out.println("circleB.radios = " + circleB.radios);
    }
}

