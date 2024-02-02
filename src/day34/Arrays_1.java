package day34;

import day30.Student;

import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        String city = "London";
        int number = 50;

        int[] numbers = new int[10];
        String[] cities = new String[3];
        cities[2] = "Leeds";
        cities[1] = "Liverpool";
        cities[0] = "New castle";
        for (String city1 : cities) {
            System.out.println(city1);
        }
        System.out.println(Arrays.toString(cities));
        System.out.println(cities.length);
        System.out.println(cities[0]);
//        System.out.println(cities[3]);ArrayIndexOutOfBoundsException

//3  UK cities      Leeds   Liverpool Newcastle
//3  France cities  Paris   Nice      Lyon
//3  Spain          Madrid  Barcelona Valencia

        String[][] threeCities = {
                {"Leeds", "Liverpool", "Newcastle"},//index 0
                {"Paris", "Nice", "Lyon"},          //index 1
                {"Madrid", "Barcelona", "Valencia"}  // index 2
                //  0            1          2
        };

        //print uk cities
        System.out.println(Arrays.toString(threeCities[0]));
        for (String c : threeCities[0]) {
            System.out.println(c);
        }
        //print spain cities
        System.out.println(Arrays.toString(threeCities[1]));
        //print france cities
        System.out.println(Arrays.toString(threeCities[2]));

        System.out.println(Arrays.deepToString(threeCities));

        String[][] cities3 = new String[3][3];
        cities3[2][1] = "Barcelona";
        cities3[2][2] = "Valencia";
        cities3[2][0] = "Madrid";


        cities3[0] = cities;
//        cities[2] = "Leeds";
//        cities[1] = "Liverpool";
//        cities[0] = "New castle";

        System.out.println(cities3[0][0]);
        System.out.println(cities3[0][1]);
        System.out.println(cities3[0][2]);

        //3  UK cities      Leeds   Liverpool Newcastle
        //3  France cities  Paris   Nice      Lyon
        //3  Spain          Madrid  Barcelona Valencia
        System.out.println("===============");
//        threeCities
        for (String[] array : threeCities) {//rows
            // System.out.println(Arrays.toString(array));
            for (String city5 : array) {//column
                System.out.println(city5);
            }
            System.out.println("=================");
        }

        //nested for loop
        //outer loop gives rows index numbers
        //inner loop gives column index numbers

        for (int i = 0; i < threeCities.length; i++) {
           // System.out.println(Arrays.toString(threeCities[i]));
            System.out.println("==================");
            for (String city5 : threeCities[i]) {
                System.out.println(city5);
            }

        }


    }
}
