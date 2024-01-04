package day16;

public class Task2 {

    public static void main(String[] args) {
        // calculate sum of even numbers 0<= num < 100

        int num = 0;
        int sum = 0;

        while (num < 100) {
//            Way-1
//            if(num % 2 == 0) {
//                sum = sum + num;
//            }

//            Way-2
            sum = sum + num;
            num += 2;
        }

        System.out.println("sum = " + sum);
    }
}
