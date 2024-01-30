package day32;

import java.util.Arrays;

public class Array_3 {
    public static void main(String[] args) {
        int[] numbers = {10, 60, 50, 80, 20};
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 20));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 20));
        System.out.println(Arrays.binarySearch(numbers, 120));
        numbers = new int[]{10, 80, 200, 60, 50, 80};
        System.out.println(Arrays.binarySearch(numbers, 60));
        numbers = new int[5];

        System.out.println(Arrays.toString(numbers));
//        Arrays.fill(numbers,10);
//        System.out.println(Arrays.toString(numbers));
        // 0  0  0  0  0
        //      20  20
        Arrays.fill(numbers, 2, 4, 20);
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 60;
        Arrays.fill(numbers, 2, 4, 120);
        System.out.println(Arrays.toString(numbers));

        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(chars);
        System.out.println(str);




    }
    //find the max value in an array
    //sum of the elements
    //print even numbers in an array
    //odd numbers in an array



    //create
//    static int search(String [] names) {
//return index
//    }

    //create
//    static int search(int[] nums) {
//return index
//    }
}
