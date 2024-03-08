package day57;

public class GeneralErrors {
    public static void main(String[] args) {
        //class name
        //case sensitive

        //  System.out.Println();
        //  system.out.Println();

        //missing brackets
        //ends semicolon

        //duplicate variable decleration
        int a = 10;
        // int a=10;
        // String  a=10;

        // without initialising local variables
        String str;
        //  System.out.println(str);


        //type mismatch

        int b = 10;
        //String result = b * 10;
        String result = "" + b * 10;
        result = String.valueOf(b * 10);

        //methods return  types
        //if you dont send arg or if you send wrong type
    //   isPositiveNumber();

    }

    public static boolean isPositiveNumber(int number) {
        if (number < 0) {
            return false;
        } else {
            return true;
        }
// System.out.println(number);Unreachable statement
    }

    public int printNumber() {
        System.out.println(10);
        return 10;
        //       return "10";
    }

}
