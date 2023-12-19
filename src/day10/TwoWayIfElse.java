package day10;

import java.util.Scanner;

public class TwoWayIfElse {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= scanner.nextInt();

        // rule is age >= 18

        if(age > 17){
            // TRUE Cond:
            System.out.println("You are eligible for vote");
        } else {  // age<= 17
            System.out.println("You are NOT eligible for vote!!");
        }


        int number = 0;
        // THIS IS NOT A GOOD PRACTICE TO USE ELSE!!!
        // BEUCASE there 1 cond 3 option!!
        if(number>=0){
            System.out.println("Number is positive");
        }else{ // number == 0 and number <0
            System.out.println("Number is Negative");
        }
    }
}
