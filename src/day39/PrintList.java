package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintList {
    public static void main(String[] args) {
        //create a method
        //with 1 parameter
        //acccepting ArrayList String
        //print the ArrayList

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Berlin",
                "Oslo", "London", "Istanbul", "Madrid"));
        printList(cities);
        ArrayList<String> capitals = new ArrayList<>(Arrays.asList("Berlin",
                "Oslo", "London", "Ankara", "Madrid", "Paris"));
        printList(capitals);
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30));
        printNumbers(numbers);
        System.out.println("capitals.indexOf(\"Liverpool\") = " + capitals.indexOf("Liverpool"));

        //create a method
        //2 parameters ArrayList<String> list  ,String word
        //word is in index 3
        //word is not inside the list
        searchWord(capitals, "Liverpool");
        searchNumber(numbers, 60);
        searchNumber(numbers, 10);
        numbers.add(101);
        numbers.add(20);
        numbers.add(13);
        System.out.println("numbers = " + numbers);
        //ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30));
        printOddNumbersInTheList(numbers);//print the odd numbers
      //  evenNumbersFromTheList(numbers);//return an ArrayList, put the even numbers in an arraylist
        int num = 11;  //odd or even
        System.out.println(num % 2 != 0);//odd number
        ArrayList<Integer> randomNumbers = new ArrayList<>(Arrays.asList(123, 198, 208, 6543));
        printOddNumbersInTheList(randomNumbers);

    }

    public static void printOddNumbersInTheList(ArrayList<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num + " is odd number.");
            }
        }
    }

    public static String searchNumber(ArrayList<Integer> nums, int num) {
        int index = nums.indexOf(num);
        String result = (index == -1) ? num + " is not in the list" : num + " is index " + index;
        System.out.println("result = " + result);
        return result;
    }


    public static void searchWord(ArrayList<String> list, String word) {
        int index = list.indexOf(word);
        if (index >= 0) {
            System.out.println(word + " is in index = " + index);
        } else {
            System.out.println(word + " is not in the list.");
        }
        String result = (index > 0) ? word + " is in index = " + index : word + " is not in the list.";
        System.out.println(result);
    }

    public static void printList(ArrayList<String> list) {
        System.out.println("list = " + list);
    }

    public static void printNumbers(ArrayList<Integer> list) {
        System.out.println("list = " + list);
    }


}
