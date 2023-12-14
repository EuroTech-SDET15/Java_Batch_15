package day8;

public class AssignmentOperators {

    public static void main(String[] args) {
        int x = 5 * (3 / 2);

        // +=  -=
        // num1 += num2 -->  num1 = num1 + num2

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int a = 1;

        num1 += a;  // num1 = num1 + a;
        System.out.println("num1 = " + num1);

        num1 += 1;  //same as  num1 = num1 + 1;  num1++;

        num1 = num1 - 2;
        num1 -= 2;

        // /=   *=  %

        int num3 = 100;
        int num4 = 2;

        // num3 = num3 / num4;
        num3 /= num4;

       //  num3 = num3 % num4;
        num3 %= num4;
    }
}
