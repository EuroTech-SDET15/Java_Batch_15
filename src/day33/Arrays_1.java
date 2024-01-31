package day33;

import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 60, 70};
        int[] nums = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(nums));
        // nums[0] = 100;
        System.out.println(numbers[0]);
        int[] copied = numbers;
        // copied[0] = 6;
        System.out.println(numbers[0]);
        int[] ints = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.equals(numbers, nums));
        System.out.println(numbers == nums);
        int[] copiedOf = Arrays.copyOf(numbers, 2);
        System.out.println(Arrays.toString(copiedOf));
        System.out.println(copiedOf.length);
        copiedOf[1] = 80;
        System.out.println(Arrays.toString(copiedOf));
//        copiedOf[2] = 90;
//        System.out.println(Arrays.toString(copiedOf));



    }
}
