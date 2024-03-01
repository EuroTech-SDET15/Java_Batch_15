package day53.inheritance;

public class Parent {
    static
    {
        System.out.println("Static block!!!!");

    }
    {

        System.out.println("instance block!!!");

    }



    int number;
    String name;
    static String country="Germany";

    Parent() {

    }

    //you cannot access instance variables inside the static methods,blocks
    static void classMethod(){
        System.out.println("Static!!!!");
       // System.out.println(this.number);
    }
    static void write(){
        System.out.println("Hi");
    }


    Parent(String firstName, int number) {
        //i want to call instance variables inside the class i can use this keyword
        this.name = firstName;
        this.number = number;
        System.out.println("Constructor ");
    }

    public void print(){
        System.out.println("Hello!!!!");
        System.out.println("country = " + country);
    }

    @Override
    public String toString() {
        return "Parent{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
