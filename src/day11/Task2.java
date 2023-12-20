package day11;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        System.out.println("a=" + a+", b=" + b+", c=" + c );

        int maxNum=0;
        // check A
        if (a>=b && a>=c){
            maxNum = a;
        }
        // check B
        if(b>=a && b>=c){
            maxNum = b;
        }
        // check C
        if(c>=a && c>=b){
            maxNum = c;
        }

        System.out.println("Max number is: "+maxNum);

    }
}
