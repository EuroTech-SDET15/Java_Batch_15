package day20;

public class MultiParam {

    public static void main(String[] args) {
        multiplyNumbers(4, 2, 3);

        double pi=3.14;
        int radios= 2;
        calculateCircleArea(pi,radios);
        int test;
//        int test;
    }

    // write a method which will multiply 3 given input and will print the result
    public static void multiplyNumbers(int num1, int num2, int num3) {
        int test;
        System.out.println(num1 + " x " + num2 + " x " + num3 + " = " + (num1 * num2 * num3));
    }

    // calculate circle area   pi x r x r

    public static void calculateCircleArea(double pi, int r) {
        int test;
        System.out.println("Area is " + (pi * r * r));

    }
}
