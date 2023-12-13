package day7;

public class Casting_2 {
    public static void main(String[] args) {
        //  Widening   byte short int  long  float  double
        //      byte     1    2    4    8     4       8
        //     =========> is allowed
        //small size type to larger size type
        //  Narrowing

        byte b = 100;//implicitly casting
        int number = b;
        short s = b;
        float f = number;//100
        System.out.println("f = " + f);// 100.0
        double d = f;
        System.out.println("d = " + d);
        int var = 50;
        double var2 = var;
        System.out.println("var2 = " + var2);//50.0

        int myInt = 30;
        double myDouble = myInt;
        //     double  <-- int
        System.out.println("myDouble = " + myDouble);
        double myDouble2 = 30;


    }
}
