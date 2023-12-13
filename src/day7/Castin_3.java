package day7;

public class Castin_3 {
    public static void main(String[] args) {
        // Narrowing -  explicitly casting
        // Larger Size--->Small Size
        // double float long int short byte

        double myDouble = 55.76;
        int number = (int) myDouble;
        System.out.println("number = " + number);
        byte myByte = (byte) number;
        System.out.println("myByte = " + myByte);
        long myLong = 12345678912345l;
        short s1 = (short) myLong;
        System.out.println("s1 = " + s1);


        int number5 = (int) 25.86;


        System.out.println((int) 45.86);


    }
}
