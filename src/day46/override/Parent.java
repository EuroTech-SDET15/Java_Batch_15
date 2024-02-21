package day46.override;

public class Parent {
    public int number;
    private int value;

    private void privateMethod() {
        System.out.println("Private method!!!!");
    }

    public void print() {
        System.out.println("Parent.");
    }

    public void greet() {
        System.out.println("Hi from parent!!!");
    }

    public Parent returnObject() {
        return new Parent();
    }

    public int getValue() {
        return value;
    }
}
