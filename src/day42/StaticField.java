package day42;

public class StaticField {

    int value = 10;  // instance fields
    static int number = 1; // class variable / static variable

    public static int taskNo; //global variable

    public static void main(String[] args) {
        int rowNumber = 10; //local variable
//        static int number = 1;
        System.out.println("number = " + number);
    }


    public static void staticMethod() {
//        static int number = 1;
        int rowNumber = 10; //local variable
        System.out.println("number = " + number);
    }

    public void instanceMethod() {
//        static int number = 1;
        int rowNumber = 10; //local variable
        System.out.println("number = " + number);
    }

    static {
//        static int number = 1;
    }
}
