package day60;

import java.util.*;

public class Maps_4 {
    public static void main(String[] args) {
        TreeMap<String, Double> cityPopulation = new TreeMap<>();
        cityPopulation.put("Istanbul", 20.0);
        cityPopulation.put("Oslo", 0.5);
        cityPopulation.put("London", 7.0);
        cityPopulation.put("Madrid", 3.3);
        cityPopulation.put("Zurich", 0.7);
        cityPopulation.put("Athens", 6.0);
        cityPopulation.put("Brussels", 1.2);
        print(cityPopulation);

        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();
        //             Key     Value
        capitals.put("India", "NewDelhi");
        //             Key      Value
        capitals.put("Macedonia", "Skopje");
        capitals.put("Turkey", "Ankara");
        capitals.put("UK", "London");
        capitals.put("Germany", "Munich");
        print(capitals);

        HashMap<String, Integer> javaGrades = new HashMap<>();
        javaGrades.put("Cevahir", 95);
        javaGrades.put("Filiz", 96);
        javaGrades.put("Gulay", 97);
        javaGrades.put("Sarita", 90);
        javaGrades.put("Sneha", 92);
        javaGrades.put("Rosana", 93);
        print(javaGrades);

        //Map<String, String> playerAges = new Map<String, String>();
        //we cant create object from interface
        Map<String, String> playerAges = new HashMap<>();

        System.out.println(studentAges());
    }

  //  public static HashMap<String, Integer> studentAges() {
    //public static HashMap studentAges() {
    public static Map studentAges() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Michael", 54);
        ages.put("David", 30);
        ages.put("Marry", 35);

        return ages;
    }


    private static void print(Map maps) {
        System.out.println("maps = " + maps);
    }

//    private static void print(HashMap<String, Integer> maps) {
//        System.out.println("maps = " + maps);
//    }
//
//
//    public static void print(LinkedHashMap<String, String> caps) {
//        System.out.println("caps = " + caps);
//    }
//
//    public static void print(TreeMap<String, Double> map) {
//        System.out.println("map = " + map);
//    }
}
