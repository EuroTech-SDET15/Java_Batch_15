package day31;

import java.util.Arrays;

public class Arrays_4 {
    public static void main(String[] args) {

        String[] capitals = new String[3];
        capitals[0] = "Oslo";
        capitals[1] = "London";
        capitals[2] = "Madrid";
        capitals = new String[10];
        System.out.println(Arrays.toString(capitals));
        int[] numbers = {10, 20, 3, 80};
        int[] copiedNumbers = numbers;
        copiedNumbers[0] = 60;
        System.out.println(numbers[0]);




    }
}
