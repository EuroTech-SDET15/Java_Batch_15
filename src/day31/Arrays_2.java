package day31;

import java.util.Arrays;

public class Arrays_2 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 90, 60, 80};//length 5
        //               0  1    2   3   4
        System.out.println(numbers[0]);
        // numbers[5] = 100;
        //  Arrays.toString(numbers);ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //after you create an array you can not change the length of that array
        numbers[0] = 30;
        System.out.println(Arrays.toString(numbers));
        int number = 50;
        numbers[1] = number;
        number = numbers[4];
        System.out.println(number);

        double[] doubleNumbers = new double[]{10.50, 60.80, 90, 60};
        System.out.println(numbers.length);
        System.out.println(doubleNumbers.length);
        //print first element of the array
        //print last element of the array-by using length
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println("=======================");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("==============");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(numbers[1]);
        System.out.println(numbers[1]);
        System.out.println("===========");
        // for, while, do-while
        //for each loop
        // int[] numbers = {30 50 90 60 80};//length 5

        for (int n : numbers) {
            System.out.println(n);
        }
        //that block will run length times
        int count = 0;
        for (int num : numbers) {
            System.out.println(num);
            System.out.println(++count + ". iteration");
        }

        System.out.println("=========");
        // double[] doubleNumbers = new double[]{10.50, 60.80, 90, 60};
        //doubleNumbers   foreach
        for (double d : doubleNumbers) {
            System.out.println(d);
        }

    }
}
