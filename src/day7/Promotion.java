package day7;

public class Promotion {
    public static void main(String[] args) {
//  + - * /
        System.out.println(2 + 3);
//                         int int-->int
        byte b = 5;
        b = (byte) (b + 4);
        // byte + int---> int
        short s = 40;
        int i = s + 10;
//  short    int  ---> result type is int

        double v = 4.7 + 10;
        //        double + int --->result type is double

        String s1 = " " + 10;
        // String  int   result type is String

        System.out.println("2+2" + 3 + 4);
        //                 2+234
        //                String+int
        //                  String  +4
        //                   String + int
        System.out.println("===================");
        System.out.println(3 + 4 + "2+2" + 3 + 4);
//                         int int --> int 7
        //                         7+ "2+2"  int + String  --->String
        //                         72+2 + 3  String int --->String
        //                        72+23  +4   String int ---> String
        //

        double d = 12.0 / 5;
        //          double int
        System.out.println(d);
        System.out.println(12 / 5);
        //                 int  int---> int
        System.out.println(12 / 5.0);
        //                 int  double-->double


        System.out.println(4 + 10 + 7);
        byte b1 = 10;
        int i1 = b1 + 20;
        //  byte int-->int
        System.out.println("addition of 2 and 3 = " + 2 + 3);
        System.out.println("addition of 2 and 3 = " + (2 + 3));
        System.out.println("multiplication of 2 and 3 = " + 2 * 3);
//precedence of the operators

//check types of the operands

        System.out.println(4 + 1 + 9 + "." + (-3 + 10) + 11 / 3);
//        System.out.println(4 + 1 + 9 + "." + 7 + 11 / 3);
//        System.out.println(4 + 1 + 9 + "." + 7 + 3);
//        System.out.println(5 + 9 + "." + 7 + 3);
//        System.out.println(14 + "." + 7 + 3);
//        System.out.println(14. + 7 + 3);
//        System.out.println(14.73);

    }
}
