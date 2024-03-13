package day60;

import java.util.TreeMap;

public class Maps_3 {
    public static void main(String[] args) {
        //keeps keys  in ascending order
        TreeMap<String, Double> cityPopulation = new TreeMap<>();
        String city = "Oslo";
        cityPopulation.put("Istanbul", 20.0);
      //  cityPopulation.put("Oslo", 0.5);
        cityPopulation.put(city, 0.5);
        cityPopulation.put("London", 7.0);
        cityPopulation.put("Madrid", 3.3);
        cityPopulation.put("Zurich", 0.7);
        cityPopulation.put("Athens", 6.0);
        cityPopulation.put("Brussels", 1.2);
        System.out.println("cityPopulation = " + cityPopulation);
        city = "Oslo";
        System.out.println(cityPopulation.get(city));
        System.out.println("cityPopulation.keySet() = " + cityPopulation.keySet());
        System.out.println(cityPopulation.values());
        System.out.println(cityPopulation.containsKey("Liverpool"));
        cityPopulation.put("Istanbul", 21.0);
        cityPopulation.put("Oslo", 0.7);
        System.out.println(cityPopulation);


    }
}
