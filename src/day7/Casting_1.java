package day7;

public class Casting_1 {
    public static void main(String[] args) {
        //  primitive data types                   //reference types String Array Objects
        //  numeric
        //  byte short int long --->integer value

        //  float double   -->  fractional values

//        non numeric
//        char
//        boolean

        byte b = 127;// 1 byte   0 is positive
        b = -128;
        // totaly  256

        b = (byte) 300;//  300 - 256
        System.out.println("b = " + b);
        b=(byte) 200;// 200 - 256  -->  - 56
        System.out.println("b = " + b);


    }
}
