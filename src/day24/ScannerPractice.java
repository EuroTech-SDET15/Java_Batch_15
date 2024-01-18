package day24;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your salary increase rate: ");
        double rate = scanner.nextDouble();
        System.out.println("rate = " + rate);


        System.out.println("Please RE enter your salary increase rate: ");
        rate = scanner.nextDouble();

        test();

        scanner.close();

    }

    /**
     *  This method for Test description check
     *  I don't know what to write
     *  I just know that I need more PRACTICE!!
     */
    public static void test(){

    }
}
