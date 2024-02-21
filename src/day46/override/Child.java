package day46.override;

public class Child extends Parent {
    //signature must be same
//     void greet() {attempting to assign weaker access privileges

    //    public int greet() {//  incompatible return typ
    public void greet() {// must be more visible or same attempting to
        System.out.println("Hi from Child!");
    }

    public Child returnObject() {//Covariant Return Types
        return new Child();
    }

}
