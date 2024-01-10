package day19;

import java.util.Scanner;

public class Methods_4 {
    public static void main(String[] args) {
        //sum of numbers 10 to 20  11 12 13 14 15 16 17 18 19
        //sum of numbers 50 to 100
        //sum of numbers 500 to 550
        //get 2 numbers from the user
        sumOfTheNUmbers();
        sumOfTheNUmbers();

    }

    static void sumOfTheNUmbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number pls!");
        int num1 = scanner.nextInt();
        System.out.println("Enter a bigger number  pls!");
        int num2 = scanner.nextInt();
        int sumBox = 0;
        for (int i = num1; i < num2; i++) {
            sumBox += i;
        }
        System.out.printf("Sum of the numbers from %d to %d is %d%n", num1, num2, sumBox);
    }


}
