package day55;

public class TryCatchSample {
    public static void main(String[] args) {

        System.out.println("TEST START");
        int actualValue = 2; // get actual from UI via selenium methods
        Integer expectedValue = 0; // get expected from DB
        // Two possible issue; 1: DB insertion/calculation problem, will return value 0
        //                     2: DB connection broke, will return NULL

        try {
            System.out.println("actualValue/expectedValue = " + actualValue / expectedValue);
        } catch (ArithmeticException e) {
            System.out.println("!!There is arithmetic exception!! it means db calculation return 0");
            System.out.println("TEST FAILED for db calculation!!");
        } catch (NullPointerException e){
            System.out.println("DB CONNECTION IS BROKE");
            System.out.println("RE CONNECT DB and/or FAIL TESTS!!!");
        }

        System.out.println("TEST END");
        System.out.println("GENERATE REPORT!");
    }
}
