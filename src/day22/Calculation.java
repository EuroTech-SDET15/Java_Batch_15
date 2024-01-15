package day22;

public class Calculation {
    //    6 methods
// sum()


    //benefits of the overloading
    //flexibilty
    //readibilty-reusability
    //reduces of complexity
    //easy to access
    //inialisation of the constructors in different ways

    public static void main(String[] args) {
        System.out.println("Math.abs(-10) = " + Math.abs(-10));
        System.out.println("Math.abs(-10.50) = " + Math.abs(-10.50));
        System.out.println("Math.abs('A') = " + Math.abs('A'));

    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

//    public static void sum(int b, int a) { if we change name of the parameters doesnt make sense  for overloading!!!!!!!!!!
//        System.out.println(a + b);
//    }

//     int sum(int a, int b) {
//        System.out.println(a + b);
//        return a + b;
//    }

    public static void sum(double a, int b) {
        System.out.println(a + b);
    }

    public static void sum(int a, double b) {
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void sum(char ch, int a, int b) {
        System.out.println(ch + a + b);
    }

}
