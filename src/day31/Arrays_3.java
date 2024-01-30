package day31;

import java.util.Arrays;

public class Arrays_3 {
    public static void main(String[] args) {
        //create an array
        //fruits   5 fruit
        //String
        String[] fruits = {"apple", "orange", "strawberry", "mango", "grape"};
//                          0          1            2           3       4
        //length of the array
        //print each element of the array
        //convert to string whole array then print

        System.out.println(fruits.length);
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        System.out.println(fruits[4]);
        System.out.println("==============");
//        String[] fruits = {"apple", "orange", "strawberry", "mango", "grape"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits[2] = "cherry";
        System.out.println(Arrays.toString(fruits));
        String[] cities = new String[5];
        System.out.println(Arrays.toString(cities));
        cities[2] = "Oslo";
        cities[0] = "Istanbul";
        cities[1] = "London";
        cities[3] = "York";
        System.out.println(Arrays.toString(cities));
        //print first element capital letter
        System.out.println(cities[0].toUpperCase());
        String city5 = "New York";
        cities[4] = city5;
        System.out.println(Arrays.toString(cities));
        city5 = cities[2];
        System.out.println(cities[0].equals("Oslo"));

        System.out.println(Arrays.toString(cities).toUpperCase());

        System.out.println(cities[0].toUpperCase());
        System.out.println(cities[1].toUpperCase());
        System.out.println(cities[2].toUpperCase());
        System.out.println(cities[3].toUpperCase());
        System.out.println(cities[4].toUpperCase());

        for (String s : cities) {
            System.out.println(s.toUpperCase());
        }
        System.out.println(Arrays.toString(cities));
        //Paris in the array

        System.out.println(Arrays.toString(cities).contains("Paris"));
//        [Istanbul, London, Oslo, York, New York]
        boolean b = false;
        String searchedCity = "London";
        int indexCounter = 0;
        for (String city : cities) {
            if (city.equals(searchedCity)) {
                b = true;
                break;
            }
            indexCounter++;
        }
        if (b) {
            System.out.println(searchedCity + " is in the array and index number is " + indexCounter);
        } else {
            System.out.println(searchedCity + " is not in the array.");
        }
        System.out.println("=====================");

        System.out.println(Arrays.binarySearch(cities, "Paris"));


        int[] numbers = {10, 5, 90, 100, 1};
        System.out.println(Arrays.binarySearch(numbers, 1));
        Arrays.sort(numbers);//ascending
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 1));

        //Arrays are mutable
        //Strings are not mutable
    }
}
