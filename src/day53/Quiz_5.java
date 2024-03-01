package day53;


import java.util.*;

public class Quiz_5 {
    public static void main(String[] args) {
        //  int[] numbers = {60,-4,20,12,0,-10};
        int[] numbers = {6, -4, 12, 0, -10};
//        System.out.println(Arrays.binarySearch(numbers, 1));
//        Arrays.sort(numbers);//ascending
//        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 12));
        Integer i = new Integer(10);
        String str = new String("");


        String var = "20.65";
//       int n= Integer.parseInt(var);
//        System.out.println("n = " + n);
        System.out.println(Double.parseDouble(var));
        System.out.println("Double.valueOf(var) = " + Double.valueOf("35.40"));

        Integer integer = new Integer(20);
        int num = integer.intValue();
        System.out.println("num = " + num);


    }
}
