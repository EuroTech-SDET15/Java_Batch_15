package day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps_5 {
    public static void main(String[] args) {
        //          key              value
        //    country(String)    cities(List)
        // Map  --> any child
        // UK -----> London, Liverpool, Manchester, newcastle
        //Turkey --> Ankara , Istanbul, Mugla
        // Germany --> Munich, Frankfurt
        // Norway ---> Oslo , Drammen, Tromso

        //  Map<String, ArrayList<String>> cities = new LinkedHashMap<>();
        Map<String, ArrayList> cities = new LinkedHashMap<>();
        ArrayList<String> uk = new ArrayList<>(Arrays.asList("London", "Liverpool", "Manchester"));
        cities.put("UK", uk);
        cities.put("Turkey", new ArrayList(Arrays.asList("Istanbul", "Mugla", "Urfa", "Adana")));
        ArrayList<String> germany = new ArrayList<>(Arrays.asList("Munich", "Frankfurt"));
        cities.put("Germany", germany);
        System.out.println("cities = " + cities);

        System.out.println(cities.get("Germany"));
        System.out.println(cities.get("Turkey"));
        //Leicester in the map
        System.out.println(cities.containsValue("London"));
        System.out.println(cities.get("UK").contains("Leicester"));
        System.out.println(cities.get("UK").contains("London"));


    }
}
