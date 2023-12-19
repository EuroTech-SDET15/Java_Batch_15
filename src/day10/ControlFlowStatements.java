package day10;

public class ControlFlowStatements {

    public static void main(String[] args) {

        int value1 = -10;

        // if number is positive then only print it is positive

        System.out.println("BEFORE 1. IF BLOCK");
        if (value1 > 0){ // if cond is true, then we'll jump inside curly brackets
            System.out.println("Value "+value1+ " is POSITIVE");
        }
        System.out.println("AFTER 1. IF BLOCK\n");

        value1 = 11;
        System.out.println("BEFORE 2. IF BLOCK");
        if (value1 < 0) {  // if cond is true, then we'll jump inside curly brackets
            System.out.println("Value " + value1 + " is NEGATIVE");
            System.out.println("Also it is not POSITIVE");
        }
            System.out.println("Statement 3");
            System.out.println("Statement 4");
            System.out.println("Statement 5");
        System.out.println("AFTER 2. IF BLOCK");







//        int number= 323123;
//
//
//        System.out.println("Given number "+number+" is even");
//
//        System.out.println("Given number "+number+" is odd");
    }
}
