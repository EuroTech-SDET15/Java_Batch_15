package day16;

import java.util.Scanner;

public class doWhilePractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password:");
        int password = scanner.nextInt();


        // if input is the same with password, print number!
        System.out.println("Enter your password guess:");
        int input = scanner.nextInt();
//        if(input == password){
//            System.out.println("password = " + password);
//        }

        while (input == password){
            System.out.println("password = " + password);
            System.out.println("Enter your password guess:");
            input = scanner.nextInt();
        }

        // even if the first guess is wrong, print the guess value

    }
}
