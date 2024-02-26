package day49.shape;

public class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        super.area = this.width * this.length;
        System.out.println("Shape of the rectangle is =  " + super.area);
        return super.area;
    }
}
