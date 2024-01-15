package day22;

public class SumDouble {

    //    Given two int values, return their sum. Unless the two values are the same,
//    then return double their sum.
//
//            sumDouble(1, 2) → 3
//    sumDouble(3, 2) → 5
//    sumDouble(2, 2) → 8
    public static void main(String[] args) {
        System.out.println(sumDouble(2, 2));
        System.out.println(sumDouble(3, 2));
        int result = sumDouble(1, 2);
        System.out.println("result = " + result);

    }

    public static int sumDouble(int a, int b) {
        int sum = 0;
        if (a == b) {
            sum = 2 * (a + b);
        } else {
            sum = a + b;
        }
        return sum;
    }

    public static int sumDouble1(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }

    public static int sumDouble2(int a, int b) {
        return a == b ? 2 * (a + b) : a + b;
    }


}
