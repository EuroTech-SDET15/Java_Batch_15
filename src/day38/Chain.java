package day38;

public class Chain {

    int number;
    String name;

    public Chain() {
        System.out.println("Default const!!");
    }

    public Chain(int number) {
        this();
        this.number = number;
        System.out.println("1 param const!!");

    }

    public Chain(int number, String name) {
        this.number = number;
        this.name = name;
        System.out.println("2 param const!!");
    }
}
