package day38;

public class MethodParams {

    public static void main(String[] args) {

        Circle circle1= new Circle();

        circle1.setRadius(10);
//        System.out.println(circle1.getPerimeter());

        printObjectSummary(circle1);

        Circle circle2;
//        printObjectSummary(circle2);
//        circle2.getArea();
    }


    public static void printObjectSummary(Circle circle){
        System.out.println("Object area is "+ circle.getArea()+
                "\nObject perimeter is "+ circle.getPerimeter()+
                "\nObject Diameter is "+ circle.getDiameter());
    }



}
