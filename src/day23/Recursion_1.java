package day23;

public class Recursion_1 {

    public static void main(String[] args) {
        // print(3);
        sum(50);
        System.out.println("sumRecursion(50) = " + sumRecursion(50));
        System.out.println("sumDigits(1234) = " + sumDigits(1234));
        System.out.println("sumDigits(567) = " + sumDigits(567));
    }

    public static void print(int num) {
        if (num != 1) {
            print(num - 1);
        }
        System.out.println(num);
    }

    public static void sum(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
            System.out.println(i);
        }

        System.out.println("sum = " + sum);
    }


    public static int sumRecursion(int number) {
        if (number == 1) {
            return 1;
        }

        return number + sumRecursion(number - 1);
    }

    //123
    public static int sumDigits(int n) {

        if (n == 0) {
            return 0;
        }
//             3  2  1                  1/10
        return n % 10 + sumDigits(n / 10);
    }
}
