package day49.base;

public abstract class Base {


    Base() {
        System.out.println("An object created from sub classes.");
        System.out.println("Elements initialised");
    }

    public void navigate(String page) {
        System.out.println("Navigated to " + page);
    }

    public static void print() {
        System.out.println("Hello!!");
    }


}
