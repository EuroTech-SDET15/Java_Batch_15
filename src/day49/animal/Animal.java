package day49.animal;

public  abstract class Animal {

    String name;
    String color;

    public void eat() {
        System.out.println(name + " is eating.");
    }
    //each animal moves, how they move will be implemented in the child class
    //if a method has not body then it is abstract method
   // if there is an abstract method in the class then you have to make class abstract as well.
    public abstract void move();
    //all the subclasses must implement abstract methods(if subclass is not abstract)

    public abstract void makeNoise();
}
