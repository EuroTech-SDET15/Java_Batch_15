package day19;

import java.util.Scanner;

public class Methods_3 {
    public static void main(String[] args) {
        //create a method
        //ask user a number
        //check whether it is even or not

        int number = 50;
        System.out.println("number = " + number);
        printNumberTen();
        evenOrOdd();
        evenOrOdd();
        evenOrOdd();
        evenOrOdd();
    }

    public static void printNumberTen() {
        double number = 10;
        System.out.println("number = " + number);

    }

    public static void evenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number pls!!!!");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even number.");
        } else {
            System.out.println(number + " is odd number.");
        }
    }


}
