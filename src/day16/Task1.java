package day16;

public class Task1 {

    public static void main(String[] args) {

        byte num1 = 127;
        byte num2 = (byte)129;
        int num3 = 2147483647;

        num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num1 = " + (num1+1));
        System.out.println("num2 = " + num2);


        int x = 1000;
        while (x > 0) {
            x++;
        }
        System.out.println("x : " + x);

    }
}
