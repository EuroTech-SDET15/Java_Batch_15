package day7;

public class Casting_4 {
    public static void main(String[] args) {
        // widening implicitly
        //small to larger data types
        // byte short int long float double

        short s = 600;
        double d = s;

        byte b = 50;
        long l = b;

        //narrowing explictly
        // larger to smaller
        // double float long int short byte

        double myDouble = 123456789123.65487;
        int number = (int) myDouble;
        System.out.println("number = " + number);

        // boolean result = myDouble; boolean is not allowed for the type casting , never use it
        //      boolean     double


        int aValue = 97;
        char letter = (char) aValue;
        System.out.println("letter = " + letter);
        // char holds 2 bytes in the memory
        number = letter;
        number = 'A';
        System.out.println("number = " + number);
        byte b1 = 'X';
        System.out.println("b1 = " + b1);


    }
}
