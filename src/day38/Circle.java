package day38;

public class Circle {

    public double radius;

    public double getArea(){
        double area= Math.PI * radius * radius;
//        System.out.println("Area of the circle is " + area );
        return area;
    }

    public double getPerimeter(){
        double perimeter= 2 * Math.PI * radius;
      //  System.out.println("Perimeter of the circle is " + perimeter );
        return perimeter;
    }

    public double getDiameter(){
     //   System.out.println("Diameter is " + (radius*2));
        return radius*2;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }




}
