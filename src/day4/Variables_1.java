package day4;

public class Variables_1 {
    public static void main(String[] args) {

//                  data type
//  integers          byte     short   int   long
//                   1 byte     2 byte 4byte 8 byte
//                     8 bit    16 bit 32bit  64bit
//                 -128 127
        //  8 bit 2 power 8 --> 256   128 is for negative values 128 is for positive , 0 is positive so max value is 127
// data type- name(identifier) value
        byte number = 25;

        System.out.println(number);

        short year;//decleration of the variable
//   = is  assignment operator
        year = 2023;

        System.out.println(year);// year.sout
        System.out.println("year = " + year);// year.soutv

        // create 2 variable     data type       int
        // first variable declaration and assignment in the same line
        // second variable decleration and assignment in different lines
        // print these variables
        // share screen in classchat channel

        int myAge = 50;
        System.out.println("myAge = " + myAge);

        int yourAge;
        yourAge = 60;
        System.out.println("yourAge = " + yourAge);
//        int age = "Hello";Required type: int  but provided String

        byte num1 = 127;
        byte num2 = -128;

        int num3, num4;//both variables type same - int
        num3 = 200;
        num4 = 500;

        int num10 = 50;
        System.out.println("num10 = " + num10);//50
        num10 = 100;//reassign a new value
        System.out.println("num10 = " + num10);//100

        //declare 1 variable assign a value print then reassign a new value and print again

        int number5 = 1000;
        System.out.println("number5 = " + number5);//1000
        number5 = 5000;
        System.out.println("number5 = " + number5);

        long currentNumber = 71220231234567l;
        System.out.println("currentNumber = " + currentNumber);
        long currentYear = 2023;
        System.out.println("currentYear = " + currentYear);

        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);//127
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);

        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);


    }


}
