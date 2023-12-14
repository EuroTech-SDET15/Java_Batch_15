package day8;

public class LogicalOperators {

    public static void main(String[] args) {

        System.out.println("true & true = " + (true & true));  // true
        System.out.println("true & false = " + (true & false)); // false
        System.out.println("false & true = " + (false & true)); // false

        System.out.println(" //////////// " );

        boolean doorA = false;
        boolean doorB = true;
        boolean doorC = true;
        boolean doorD = false;

        boolean canIEnterHome = (doorA & doorB & doorC) | doorC;


                canIEnterHome = (doorA && doorB && doorC) || doorC;


        System.out.println("////////////");

        System.out.println(true || false); // true
        System.out.println(false && true); // false


        System.out.println("////////////");


        int a = 1;
        int b = 2;

        //boolean result = a > b || ++a == b; true a=2
//        boolean result = a > b | ++a == b;  true a=2
//        boolean result = a > b & ++a == b;  false a=2
//        boolean result = a > b && ++a == b;  // false a=`1`
//        boolean result = a < b || ++a == b;  //  true a=1
        boolean result = a < b && ++a == b;  //  true a=2

        System.out.println("a = " + a);
        System.out.println("result = " + result);


    }
}
