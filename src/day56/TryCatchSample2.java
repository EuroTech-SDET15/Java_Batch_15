package day56;

import java.util.Scanner;

public class TryCatchSample2 {

    public static void main(String[] args) {

        System.out.println("TEST START");
        Integer actualValue = 2; // get actual from UI via selenium methods
        Integer expectedValue = 0; // get expected from DB
        // Two possible issue; 1: DB insertion/calculation problem, will return value 0
        //                     2: DB connection broke, will return NULL
        try {
            System.out.println("Start TRY block");
            System.out.println("actualValue/expectedValue = " + actualValue / expectedValue);
            System.out.println("End TRY block");

             String name="Test";
             System.out.println("name.charAt(10) = " + name.charAt(10));
        } catch (ArithmeticException e) {
            System.out.println("!!There is arithmetic exception!! it means db calculation return 0");
            //System.out.println("TEST FAILED for db calculation!!");
//            e.printStackTrace();
//            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("Reset expected value, try again!!");
            expectedValue = 00;
            System.out.println("actualValue/expectedValue = " + actualValue / expectedValue);

        } catch (NullPointerException e) {
            System.out.println("DB CONNECTION IS BROKE");
            System.out.println("RE CONNECT DB and/or FAIL TESTS!!!");

            try {
                System.out.println("actualValue/expectedValue = " + actualValue / expectedValue);
            } catch (NullPointerException ee){
                System.out.println("Reset DB not working, FAIL TEST!!!");
                System.exit(1);
            }

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String manipulation cause issue!! Stop run!");
        }

        System.out.println("TEST END");
        System.out.println("GENERATE REPORT!");
    }
}
