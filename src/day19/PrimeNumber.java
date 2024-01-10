package day19;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you enter a positive number!!!!!");
        int number = scanner.nextInt();
        //6
        //2   6
        //6%2==0  --->not prime
        //9%2!=0  --> prime  will give wrong answer
        //9%2    9%3=>0 not prime 9%4  9%5 9%6 9%7 9%8
        //7  7%2 7%3 7%4 7%5 7%6

        boolean isNumberPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isNumberPrime = false;
                break;
            }
        }
        if (isNumberPrime) {
            System.out.printf("%d is a prime number", number);
        } else {
            System.out.printf("%d is a not prime number", number);
        }
        String result = (isNumberPrime) ? number + " is prime number!!" : number + " is not prime number!!";
        System.out.println("\nresult = " + result);

    }
}
