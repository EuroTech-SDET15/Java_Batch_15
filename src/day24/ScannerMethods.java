package day24;

import java.util.Scanner;

public class ScannerMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a NUMBER: ");

        System.out.println("scanner.hasNextInt() = " + scanner.hasNextInt());

        if(scanner.hasNextInt()){
            int number= scanner.nextInt();
            System.out.println("number = " + number);
        }

        System.out.println("TEST1");
        System.out.println("TEST2");
        System.out.println("TEST3");

    }
}
