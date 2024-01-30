package day31;

import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        int number;
        number = 10;
        //10 20 30 50 80 90
        int[] numbers = new int[5];
        //each member of array is an element
        numbers[0] = 10;
        numbers[1] = 50;
        numbers[2] = 80;
        numbers[3] = 30;

        System.out.println(numbers[1]);
        System.out.println(numbers[4]);//as a default 0
//        int[] evens; Variable 'evens' might not have been initialized
//        System.out.println(evens[0]);
        //can you create an array
        //length 4
        // double
        //print each element
        //doubleNumbers
        double doubleNumbers[] = new double[4];

        doubleNumbers[3] = 50.60;
        doubleNumbers[2] = 70;
        doubleNumbers[1] = 90.60;

        double doubleValue = 80.64;
        doubleNumbers[0] = doubleValue;

        System.out.println(doubleNumbers[0]);
        System.out.println(doubleNumbers[1]);
        System.out.println(doubleNumbers[2]);
        System.out.println(doubleNumbers[3]);

        System.out.println(doubleNumbers);//Returns a string representation of the contents of the specified array.
        System.out.println(Arrays.toString(doubleNumbers));
        System.out.println(Arrays.toString(numbers));


    }
}
