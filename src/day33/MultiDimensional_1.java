package day33;

import java.util.Arrays;

public class MultiDimensional_1 {
    public static void main(String[] args) {

        //      4   3  6  8  5
        //      7   4  5  3  2
        //      5   6  3  4  9
        //      3   7  4  5  6
        int number = 4;
        int[] firstWeek = {4, 3, 6, 8, 5};
        int[] secondWeek = {7, 4, 5, 3, 2};
        int[] thirdWeek = {5, 6, 3, 4, 9};
        int[] fourthWeek = {3, 7, 4, 5, 6};

        int[] fifthWeek = {5, 7, 6, 8, 3};
        int[][] javaHours = {
                {4, 3, 6, 8, 5},
                {7, 4, 5, 3, 2},
                {5, 6, 3, 4, 9},
                {3, 7, 4, 5, 6}
        };
        System.out.println(javaHours.length);//number of the arrays in the javaHours

        String name = "Messi";
        String[] players = {"Messi", "Ronaldo", "Pele"};

        //Cevahir  Sneha  Sarita  first team --first row--first array
        //Filiz   Gulay   Rosana  second team--second row-second array
        //Hasna   Marry  Linda    third team --third row-third array
        //Messi  Ronaldo  Pele    fourth team--fourth row--fourth array

        String[][] teams = new String[4][3];
        teams[0] = new String[]{"Cevahir", "Sneha", "Sarita"};
        System.out.println(Arrays.toString(teams[0]));
        System.out.println(teams[0][0]);
        System.out.println(teams[0][1]);
        System.out.println(teams[0][2]);
        teams[1][0] = "Filiz";
        teams[1][1] = "Gulay";
        teams[1][2] = "Rosana";
        teams[2][0] = "Hasna";
        teams[2][1] = "Marry";
        teams[2][2] = "Linda";
        teams[3][0] = "Messi";
        teams[3][1] = "Ronaldo";
        teams[3][2] = "Pele";
        System.out.println(Arrays.deepToString(teams));
        System.out.println(Arrays.toString(teams[2]));
        System.out.println(teams[0][0]);
        System.out.println(teams[1][0]);
        System.out.println(teams[1][2]);


    }
}
