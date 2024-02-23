package day48;

public class FinalVariable {

    final int SERIAL_NUMBER;   // OPTION-1 =1234;

    public FinalVariable() {
        // OPTION-2 SERIAL_NUMBER = 1234;
    }

    {//Instance block
        SERIAL_NUMBER = 1234;
    }

    public static void main(String[] args) {

        System.out.println(Math.PI);
        final boolean isEligibleToVote;
        int age= 19;
        isEligibleToVote = age>18;
        System.out.println("isEligibleToVote = " + isEligibleToVote);
    }



}
