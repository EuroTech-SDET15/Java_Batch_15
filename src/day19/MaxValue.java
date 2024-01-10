package day19;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        //get 2 value from the user
        // find the max one
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number pls!!");
        int num1 = scanner.nextInt();
        System.out.println("Enter one more number pls!!");
        int num2 = scanner.nextInt();
        int max = 0;
        max = (num1 > num2) ? num1 : num2;
        System.out.println("max = " + max);
//  10 25 35 4 70 30  ===> 35 is greatest value
//  100 250 35 40 700 30 60 80 500 ===> 700 is greatest value
        // loop
        boolean isUserWantToEnterNumber = true;




    }
}
