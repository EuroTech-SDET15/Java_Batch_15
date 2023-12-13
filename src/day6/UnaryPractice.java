package day6;

public class UnaryPractice {

    public static void main(String[] args) {

        int num1 = 10;
        System.out.println("num1 = " + num1);

        num1 = num1 + 1;
        System.out.println("num1 = " + num1);

        num1++; //unary increment operator
        System.out.println("num1 = " + num1);

        num1--;
        System.out.println("num1 = " + num1);

        System.out.println(" =---------------------------------=");

        System.out.println("1 - 2 = " + (1 - 2));
        System.out.println("(1 - -2) = " + (1 - -2));

        System.out.println(" =---------------------------------=");

        boolean isActive = true;
        System.out.println("!isActive = " + !isActive);

        System.out.println("isActive = " + isActive);


        System.out.println(" =---------------------------------=");

    }
}
