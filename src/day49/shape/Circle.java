package day49.shape;

public class Circle extends Shape {
    double radius;

    Circle(double rad) {
        this.radius = rad;
    }

    @Override
    public double calculateArea() {
        super.area = Math.PI * Math.pow(this.radius, radius);
        return area;
    }
}
