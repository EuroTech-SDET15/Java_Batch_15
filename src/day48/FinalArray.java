package day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalArray {

    public static void main(String[] args) {

        final int[] numbers = {11,22,33};

        numbers[0]=111;

        System.out.println("numbers = " + Arrays.toString(numbers));

        int[] numbers2 = {33,44,55};

//        numbers = numbers2;

        final ArrayList<Integer> numList = (ArrayList) Arrays.asList(numbers);
        ArrayList<Integer> numList2 = (ArrayList) Arrays.asList(numbers2);

//        numList= numList2;


    }
}
