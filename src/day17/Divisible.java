package day17;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        //get a number from user
        // check divisible by 2  then by 3 if it is true print "divisible by 6"
        //  "not divisible by 6"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number pls!!!!");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            if (number % 3 == 0) {
                System.out.println("divisible by 6");
            }
        } else {
            System.out.println("not divisible by 6");
        }

        System.out.println("=================");

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("divisible by 6");

        } else {
            System.out.println("not divisible by 6");
        }

        //convert that code to ternary operator!!!!


        boolean result = (number % 2 == 0 && number % 3 == 0) ? true : false;
        String stringResult = (number % 2 == 0 && number % 3 == 0) ? "divisible by 6" : "not divisible by 6";
        System.out.println("result = " + result);
        System.out.println("stringResult = " + stringResult);




    }
}
