package day49.shape;

import day37.Circle;

public class Test {
    public static void main(String[] args) {
        //    Circle  5
        //    circle.calculateArea();//print area in the method

        Rectangle rectangle = new Rectangle(10,5);
//        rectangle.width=10;
//        rectangle.length=5;
        rectangle.calculateArea();

        Rectangle rectangle2=new Rectangle(6,12);
        rectangle2.calculateArea();
    }
}
