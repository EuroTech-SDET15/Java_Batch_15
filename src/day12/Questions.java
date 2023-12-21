package day12;

public class Questions {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        if (x > 2) {
            if (y > 2) {
                System.out.println(x + y);
            }
        } else {
            System.out.println("x is " + x);
        }


        int a = 10;
        int b = 7;

        //how can i swap those values
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //without creating third variable, how can we swap the values?

    }
}
