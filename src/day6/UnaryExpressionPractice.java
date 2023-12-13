package day6;

public class UnaryExpressionPractice {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        System.out.println(a+b); // 2 + 4 = 6
        System.out.println(++a + b); // 3 + 4 = 7

        a=2;
        b=4;
        System.out.println(++a + ++b); // 3 + 5 = 8

        a=2;
        b=4;
        System.out.println(a++ + ++b); // 2 + 5 = 7
        System.out.println("a = " + a); // 3


    }
}
