package day15;

import java.util.Scanner;

public class OddNumbers {
    //from user get 2 number (first number will be less then the second one)
    //find the the odd numbers between numbers
    //for example first number is 20  second number is 30
    // 21 23 25 27 29
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter 2 numbers!!!");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int first = 0;
        int second = 0;
        // 50               20
        if (firstNumber > secondNumber) {
            first = secondNumber;//20
            second = firstNumber;//50
        }
//                     20          50
        for (int i = first; i <= second; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }


        //swap the values without creating third variable


        int a = 4;
        int b = 10;

        a = a + b;
        b = a - b;
        //  14-10  b=4
        a = a - b;
//          14 - 4 --> 10
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //a=10
        //b=4
    }
}
