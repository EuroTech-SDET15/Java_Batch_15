package day56;

public class finalBlockSample {

    public static void main(String[] args) {

        System.out.println("START MAIN");
        try {
            System.out.println(1 / 1);
            // other tests...

            String test=null;
            test.charAt(1);
            throw new ArrayIndexOutOfBoundsException();

        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("TEST FAILURE!!");
        } finally {
            System.out.println("CLOSE BROWSER!!");
        }

        System.out.println("END MAIN");
    }
}
