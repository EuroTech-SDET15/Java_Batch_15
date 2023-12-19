package day10;

import java.util.Scanner;

public class HiFiveExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt() ;

        System.out.println("number = " + number);

        // write a condition to check hi five!!!
        // If the number is a multiple of 5

        if(number%5 == 0){
            System.out.println("Hi Five!");
        }
        // write a condition to check hi even!!!
        // If the number is divisible by 2
        if(number%2 == 0){
            System.out.println("Hi Even!");
        }
    }
}
