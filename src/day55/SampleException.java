package day55;

import day55.Test.TestParent;

public class SampleException {

    public static void main(String[] args) {
        System.out.println("Main method - Start point");
//        ArithmeticException

//        System.out.println(1/0);

        System.out.println("Main method - End point");


        String name="";
  //      name.charAt(1);

        name = null;
  //      System.out.println(name.equals("Test"));

//        int number = Integer.parseInt("one");

        TestParent.twoDivisionCalculation(6,3,1,0);
    }
}
