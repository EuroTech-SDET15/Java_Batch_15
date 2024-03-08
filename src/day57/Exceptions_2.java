package day57;

import javax.swing.text.html.StyleSheet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_2 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to divide");
        try {
            a = scanner.nextInt();
        } catch (InputMismatchException i) {
            i.printStackTrace();
            System.out.println("My friend we want a number !!!!!");
            System.out.println("as a default we assigned 100");
            a = 100;
        }
        scanner.next();
        System.out.println("Enter a number for divide by!");

        b = scanner.nextInt();
        int result = a / b;
        System.out.println("result = " + result);
    }
}
