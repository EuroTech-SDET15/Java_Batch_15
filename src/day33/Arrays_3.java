package day33;

import day15.OddNumbers;

import java.util.Arrays;

public class Arrays_3 {
    public static void main(String[] args) {
        int[] numbers = {13, 160, 81, 70, 19};
        int[] reversed = new int[numbers.length];

        System.out.println(Arrays.toString(oddNumbers(numbers)));
        oddNumbers1(numbers);
    }

    static void oddNumbers1(int[] numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println("num = " + num);
            }
        }
    }

    public static int[] oddNumbers(int[] numbers) {
        int oddCount = 0;
        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int[] oddNumbers = new int[oddCount];
        int[] evenNumbers = new int[evenCount];
        int a = 0;
        int b = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers[a] = num;
                a++;
            } else {
                oddNumbers[b] = num;
                b++;
            }
        }
        return oddNumbers;
    }
}
