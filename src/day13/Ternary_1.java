package day13;

public class Ternary_1 {
    public static void main(String[] args) {
        // create 2  int variables find the bigger one
        //  create another variable int max   , assign that variable the bigger one
        //after if statement print value of the max
        int num1 = 10;
        int num2 = 20;
        int max;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        System.out.println("max = " + max);

        //             condition     expresssion   expresion2
        int result = (num1 > num2) ? num1 : num2;
//                                   true    false
        System.out.println("result = " + result);
        num1 = 200;
        num2 = 100;
        boolean b = num1 > num2 ? true : false;
        System.out.println("b = " + b);
        // (num1 > num2) ? System.out.println("num1") : System.out.println("num2"); ERRORRRRRRRRR!!!!!!
        num1 = 50;
        num2 = 400;
        String resultString = (num1 > num2) ? "num1 is greater then num2" : "num2 is greater then num1";
        System.out.println("resultString = " + resultString);

        int number = -10;
        //whether number is positive or negative val
        String s = (number > 0) ? "number is positive" : "number is negative";
        System.out.println("s = " + s);
        s = (number > 0) ? number + " is positive" : number + " is negative";
        System.out.println("s = " + s);
        max = 40;
//        boolean resultBoolean = (40 = 20) ? true : false; errorrrrrr
        boolean resultBoolean = (max == 20) ? true : false;
//        if (max = 20) { errorrrrrr
//
//        }
        if (max <= 20) {

        }
    }
}
