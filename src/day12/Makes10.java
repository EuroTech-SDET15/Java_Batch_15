package day12;

public class Makes10 {

    //    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
//
//    makes10(9, 10) → true
//    makes10(9, 9) → false
//    makes10(1, 9) → true
    public static void main(String[] args) {
        int a = 9;
        int b = 10;

        if (a == 10) {
            System.out.println(true);
        } else if (b == 10) {
            System.out.println(true);
        } else if (a + b == 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        a = 10;
        b = 10;
        if (a == 10 || b == 10 || a + b == 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//        "false" is not equals false

        if (a == 10 || b == 10 || a + b == 10)
            System.out.println(true);
        else
            System.out.println(false);


    }


}
