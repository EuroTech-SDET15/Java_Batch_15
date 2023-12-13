package day6;

public class UnaryPostAndPre {

    public static void main(String[] args) {

        // POST INC
        int a= 5;
        int value1 = a++; // assign a(5) to value1 first THEN Increment 'a' to 6
        System.out.println("value1 = " + value1); // 5
        System.out.println("a = " + a); // 6

        // PRE INC
        int b = 5;
        int value2 = ++b; // increment 'b' to 6 first THEN assign b new value(6) to value2
        System.out.println("value2 = " + value2); // 6
        System.out.println("b = " + b); // 6


        // POST DEC
        int c= 5;
        int value3 = c--; // assign c(5) to value3 first THEN decrement 'c' to 4
        System.out.println("value3 = " + value3); // 5
        System.out.println("c = " + c); // 4

        // PRE DEC
        int d = 5;
        int value4 = --d; // decrement 'd' to 4 first THEN assign d new value(4) to value4
        System.out.println("value4 = " + value4); // 4
        System.out.println("d = " + d); // 4


        System.out.println("//////////////////////");

        int num1 = 5 ;
        num1++;
        System.out.println("num1 = " + num1); // 6

        int num2 = 5 ;
       ++num2;
        System.out.println("num2 = " + num2); // 6
    }
}
