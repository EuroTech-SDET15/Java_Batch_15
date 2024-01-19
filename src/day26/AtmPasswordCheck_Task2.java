package day26;

import java.util.Random;
import java.util.Scanner;

public class AtmPasswordCheck_Task2 {

   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // You will write a code to ask card password to ATMs
        // user should enter the password, if users enter the correct password say welcome!
        // if users do not enter the correct password, give warning to user! 'Wrong password, Enter again! ',
        // give two more changes to user
        // if users find the correct password in the remaining 2, say "welcome"
        // if user cannot find the password in last changes then print "Your account is banned!"


//        TODO 2. TASK FOR FRIDAY
        /**
         * Change the password to numeric value, and ask a number only from user.
         * If user provides non-numeric values, print a message to user as "INVALID INPUT! Enter a number: " and give 3 times try for this error
         * If user provides wrong number, print a message to user as "WRONG PASSWORD, please re-enter a password: " and give 3 times try for this error
         */

        passwordCheck();

        // TODO Fix the bug !! after enter 1 valid number, counter of invalid input reset itself!! should not reset!!
    }
// 2. task
    public static void passwordCheck() {
        Random random = new Random();
        int password = random.nextInt(10);
        //System.out.println("password = " + password);

        System.out.println("Welcome ABC Bank ATM!");
        int inputPassword = getValidIntPasswordFromUser();
        int counter = 1;

        while((inputPassword != password) && counter<3){
            System.out.println("Wrong password!!!");
            inputPassword = getValidIntPasswordFromUser();
            counter++;

        }

        if(inputPassword== (password)){
            System.out.println("WELCOME!!! You successfully login the account! ");
        }else {
            System.out.println("YOU BANNED!!! Get out of my bank!");
        }
    }

    // Whenever I need a valid password, I can call this method!!
    public static int getValidIntPasswordFromUser(){
        System.out.println("Enter a number for password: ");
        int count = 0;

      while(true){
          count++;
          if(scanner.hasNextInt()){
              break;
          }

          if(count ==3){
              System.out.println("You enter 3 times invalid input!! ");
              System.out.println("Your account is BANNED, Get out of our bank!! ");
              System.exit(1);
          }
          scanner.next();
          System.out.println("Invalid Password, enter a number!: ");
      }
       return scanner.nextInt();
    }





}
