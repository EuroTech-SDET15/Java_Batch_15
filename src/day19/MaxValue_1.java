package day19;

import java.util.Scanner;

public class MaxValue_1 {
    public static void main(String[] args) {

        findMaxValue();



    }

    static void findMaxValue() {
        //from user get 2 number and print max one
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number pls!");
        int num1 = scanner.nextInt();
        System.out.println("Enter one more number pls!");
        int num2 = scanner.nextInt();
        int max = num1 > num2 ? num1 : num2;
        System.out.println("max = " + max);
    }
}
