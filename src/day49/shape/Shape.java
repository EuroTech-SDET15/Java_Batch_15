package day49.shape;

public abstract class Shape {
    //      Shape    color   , area , perimeter
    //     paint(String )   calculateArea -->declare it in the shape class but
//                                          implement in the child class
    //    Circle                                  Rectangle
    //double radius                             double   length ,   double width  length*width
    //while creating circle
    //get the radius(initialise radius)
    //dont do that  --> circle.radius=5.6;

//   private String color;
    String color;
//   private double area;//common properties used by all the subclasses
   double area;
  private   double perimeter;


    public abstract double calculateArea();//return area

    public void paint(String color) {
        this.color = color;
    }

}
