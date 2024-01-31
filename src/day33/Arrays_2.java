package day33;

import java.util.Arrays;
import java.util.OptionalInt;

public class Arrays_2 {
    public static void main(String[] args) {
        int[] numbers = {15, 30, 66, 21, 87};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " is even number");
            }
        }
        System.out.println("============");
        Arrays.stream(numbers).filter(n -> n % 2 == 0).forEach(System.out::println);
        Arrays.stream(numbers).map(x -> x * 10).forEach(System.out::println);
        Arrays.stream(numbers).map(n -> n * 10).filter(n -> n > 500).forEach(System.out::println);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.stream(numbers).sum());
        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println("=======================");

    }
}
