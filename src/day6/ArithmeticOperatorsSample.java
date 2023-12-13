package day6;

public class ArithmeticOperatorsSample {

    public static void main(String[] args) {

        int num1; //declaration
        num1 = 1; // initialize
        num1 = 10; // assign a new value

        int num2 = 5; // declaration and initialize in the same row
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("-------------------------------------");

        int addition = num1 + num2;  // 1.operand   operator   2.operand
        System.out.println("addition = " + addition);

        int subtraction = num1 - num2;
        System.out.println("subtraction = " + subtraction);

        int division = num1 / num2;
        System.out.println("division = " + division);

        num2 = 3;
        System.out.println("num2 = " + num2);
        int modulo = num1 % num2;
        System.out.println("modulo = " + modulo);

        System.out.println("-------------------------------------");
        int num3 = 3;
        // Task-1 Add num1 and num2 then multiply with num3 and assign the result to num4

        int num4 = num1 + num2 * num3;
        System.out.println("num4 = " + num4);
        System.out.println("-------------------------------------");

        System.out.println("RESULT: " + (2 + 6 / 2 * 3 + 2 % 2));

        System.out.println(2 % 2);


        System.out.println("-------------------------------------");

        num1 = 10;
        num2 = 1;
        num3 = 5;
        num4 = 20;

        // write an expression to calculate mid-value(average) of nums
        int average = (num1 + num2 + num3 + num4) / 4;


    }
}
