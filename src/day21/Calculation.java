package day21;

public class Calculation {
    public static void main(String[] args) {
        System.out.println(multiply(10, 20));
        System.out.println(divide(20, 2));

        System.out.println(fourOperation("add", 10, 5));
        fourOperation("subtract", 100, 50);
        fourOperation("multiply", 6, 50);
        fourOperation("divide", 100, 5);

        //create a method get day number as a parameter  and return day
        //create a method get the month and return season
        //codingbat sumDouble,make10, postNeg, or35,icyHot, in1020
        // add a and b check the result is odd or not    double add(a,b)   boolean odd(a,b)  void printOddEven(a,b)

    }

    //add(int a,int b)-->return a+b
    //subtract(int a,int b)
    //multiply(int a,int b)
    //divide(int a,int b)

    public static double fourOperation(String operation, int a, int b) {
        //                                   add,divide  10    2
        double result = 0;
        switch (operation) {
            case "add":
                result = add(a, b);
                break;
            case "subtract":
                result = subtract(a, b);
                break;
            case "multiply":
                result = multiply(a, b);
                break;
            case "divide":
                result = divide(a, b);
                break;
            default:
                System.out.println("couldnt found operation!!!!");
        }
        //after add operation 10 by 5 , result is 15
        System.out.println("After " + operation + " operation " + a + " by " + b + " result is " + result);
        return result;
    }

    public static double add(int a, int b) {
        return a + b;
    }

    public static double subtract(int a, int b) {
        return a - b;
    }

    public static double multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return a / b;
    }


}
