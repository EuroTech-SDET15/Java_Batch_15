package day20;

import java.util.Scanner;

public class Exercise {


    public static void main(String[] args) {

        evenOrOdd(11);
        evenOrOdd(12);
    }

    // create a method to check given number is even or odd!!


    public static void evenOrOdd(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even number.");
        } else {
            System.out.println(number + " is odd number.");
        }
    }
}
