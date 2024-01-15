package day22;

public class OverLoading_1 {
    public static void main(String[] args) {
        print(10);
        print("Ali");
        print("Ronaldo", 50);//each of the value is argument
        print(40, "Messi");
    }
    // the data type must be different
    // number of parameters must be different
    // order of the data types must be different


    //print --->1 int parameter --> print number
    //          create another method print String name
    public static void print(int number) {
        System.out.println("number = " + number);
    }
//    public static void print(int age) {  name of the parameter is not a difference
//        System.out.println("age = " + age);
//    }
    public static void print(int number,int number1) {
        System.out.println("number = " + number);
    }
    public static void print(byte age){
        System.out.println("age = " + age);
    }
    public static void print(double temp) {
        System.out.println("teprature " + temp);
    }

    public static void print(String name, int number) {
        System.out.println(name + " is " + number + " age years old.");
    }

    public static void print(int number, String name) {
        System.out.println(name + " is " + number + " age years old.");
    }



    public static void print(String name) {
        System.out.println("name = " + name);
    }
//      int print(int number) { return type is not a diffrence in terms of overloading
//        System.out.println("number = " + number);
//        return 4;
//    }

    public static void print() {
        System.out.println("Hello");
    }


}
