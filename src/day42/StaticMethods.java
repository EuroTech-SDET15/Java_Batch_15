package day42;

public class StaticMethods {
    String name="Default Name";

    public static void main(String[] args) {
        System.out.println("Math.max(2,22) = " + Math.max(2, 22));
        printRandomNumber();

        StaticMethods obj1 = new StaticMethods();
        obj1.name= "JOHN";
        obj1.printMyName();

//        printMyName();
//        System.out.println("name = " + name);

//        printHi();
        obj1.printHi();
    }

    public void printMyName(){
        System.out.println("My name is = " + name);
    }

    public static void printRandomNumber(){
        System.out.println(Math.random());
    }

    public void printHi(){
        System.out.println("Hi!");
        printMyName();
    }

}
