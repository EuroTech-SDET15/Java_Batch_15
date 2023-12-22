package day13;

public class Ternary_2 {
    public static void main(String[] args) {
        int a = 400;
        int b = 3000;
        int c = 2000;
        int max = 0;
        //find the greatest value and assign to max
        //then print max
        if (a > b) {
            if (a > c) {
                max = a;
            }
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("max = " + max);
        int max3 = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;

        System.out.println("max3 = " + max3);
        b = 3000;
        a = 5000;
        c = 7000;
        String maxString = (a > b && a > c) ? "a is max" : (b > c) ? "b is max" : "c is max";
        System.out.println("maxString = " + maxString);


    }
}


