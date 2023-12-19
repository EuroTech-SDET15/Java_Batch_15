package day10;

import java.util.Scanner;

public class ScannerBasicIntro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Now JVM will stop and you need to enter a INTEGER (then hit enter to continue): ");
        int number = scanner.nextInt() ;
        System.out.println("number = " + number);

        System.out.println("Enter double number: ");
        double floatingNumber = scanner.nextDouble();
        System.out.println("floatingNumber = " + floatingNumber);

        System.out.println("Enter a word: ");
        String data= scanner.next();
        System.out.println("data = " + data);
    }
}
