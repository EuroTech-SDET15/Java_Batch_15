package day15;

public class GetSum {
    public static void main(String[] args) {
        // find the sum of the numbers between 1-100
        int sum = 0;
        int sumOfEven = 0;
        for (int i = 1; i <= 100; i++) {
//            sum = sum + i;
            sum += i;
        }
        System.out.println("sum = " + sum);

        int sumOfOdd = 0;
        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
//                sumOfEven = sumOfEven + i;
                sumOfEven += i;
            } else {
                sumOfOdd += i;
            }
        }
        System.out.println("sumOfEven = " + sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);


        boolean resultCheck = sumOfEven + sumOfOdd == sum;
        System.out.println("resultCheck = " + resultCheck);
    }
}
