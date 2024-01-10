package day18;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //if the user enters a negative value carry on asking a positive number

//        if (number < 0) {
//            System.out.println("pls enter a positive number!!!ok positive numberr!!!");
//            number = scanner.nextInt();
//        }

        //first solution with do-while loop
        int number = 0;
//        do {
//            System.out.println("Enter a positive number pls!!!");
//            number = scanner.nextInt();
//        } while (number < 1);//do block will be running as long as the condition is wrong
//        System.out.println("number = " + number);

        //


//        while (number < 1) {
//            System.out.println("Enter a positive number pls!!!");
//            number = scanner.nextInt();
//        }
//        System.out.println(" your number is  " + number);

//        for (; number < 1; ) {
//            System.out.println("Enter a positive number pls!!!");
//            number = scanner.nextInt();
//        }
//        System.out.println("number = " + number);

        number = 123;

        int reversed = 0;


        int remaining = number % 10;
        System.out.println("remaining = " + remaining);
        reversed = remaining;
        System.out.println("reversed = " + reversed);
        System.out.println("number = " + number);
        number = number / 10;
        System.out.println("number = " + number);
        remaining = number % 10;
        System.out.println("remaining = " + remaining);
        System.out.println("reversed = " + reversed);
        //32
        reversed = reversed * 10 + remaining;
        System.out.println("reversed = " + reversed);
        number = number / 10;
        remaining = number % 10;
        reversed = reversed * 10 + remaining;
        System.out.println("reversed = " + reversed);
        System.out.println("number = " + number / 10);
        number = 654987;
//123
        reversed = 0;
        while (number > 0) {
            remaining = number % 10;
            reversed = reversed * 10 + remaining;
            number = number / 10;
        }

        System.out.println("reversed = " + reversed);

        // do you want to get reversed of the number
        // if true
        boolean isUserWantReverseOfTheNumber = true;

        while (isUserWantReverseOfTheNumber) {
            System.out.println("ok enter your number again");
            reversed = 0;
            while (number > 0) {
                remaining = number % 10;
                reversed = reversed * 10 + remaining;
                number = number / 10;
            }
            System.out.println("reversed = " + reversed);
            System.out.println("Will you reverse of the number?");
            isUserWantReverseOfTheNumber = scanner.nextBoolean();
            if (isUserWantReverseOfTheNumber) {
                System.out.println("Enter again a number to reverse!!!!");
                number = scanner.nextInt();
            }else {
                System.out.println("It is end of our service, if you are happy give a feedback!!!");
                break;
            }
        }

        System.out.println("after while block!!!!");


    }
}
