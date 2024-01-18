package day24;

import java.util.Scanner;

public class AtmPasswordCheck {

    public static void main(String[] args) {
        // You will write a code to ask card password to ATMs
        // user should enter the password, if users enter the correct password say welcome!
        // if users do not enter the correct password, give warning to user! 'Wrong password, Enter again! ',
        // give two more changes to user
        // if users find the correct password in the remaining 2, say "welcome"
        // if user cannot find the password in last changes then print "Your account is banned!"
        passwordCheck();

//        TODO TASK FOR FRIDAY
        /**
         * Change the password to numeric value, and ask a number only from user.
         * If user provide non-numeric values, print a message to user as " ter a number: " and give 2 times try for this error
         * If user provide wrong number, print a message to user as "WRONG PASSWORD, please re-enter a password: " and give 3 times try for this error
         */
    }

    public static void passwordCheck() {

        String password = "1q2w";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome ABC Bank ATM, please enter your password:");
        String inputPassword = scanner.nextLine();
        int counter = 1;

        while(!inputPassword.equals(password) && counter<3){
            System.out.println("Wrong password!! Please re enter the password: ");
            inputPassword = scanner.nextLine();
            counter++;

        }

        if(inputPassword.equals(password)){
            System.out.println("WELCOME!!!");
        }else {
            System.out.println("YOU BANNED!!! Get out of my bank!");
        }
    }


}
