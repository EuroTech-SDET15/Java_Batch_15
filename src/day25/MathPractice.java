package day25;

public class MathPractice {

    public static void main(String[] args) {

        //  |-4| = 4  abs  |4| = 4
        System.out.println("Math.abs(-4) = " + Math.abs(-4));

        // Round15.99 -> 16    15.49 --> 15
        System.out.println("Math.round(15.49) = " + Math.round(15.49));
        System.out.println("Math.round(15.99) = " + Math.round(15.99));

        // Ceiling  round upward!!  15.01 ->  16!!
        System.out.println("Math.ceil(15.01) = " + Math.ceil(15.01));

        // Flooring round downward !! 15.99 -> 15!!
        System.out.println("Math.floor(15.99) = " + Math.floor(15.99));

        // max - min
        System.out.println("Math.max(-1,1) = " + Math.max(-1, 1));
        System.out.println("Math.min(-1,1) = " + Math.min(-1, 1));

        // calculate area of circle
        //  PI x R X R
        System.out.println("Circle Area = " + (Math.PI * Math.pow(2, 2)));
    }
}
