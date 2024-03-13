package day60;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Maps_2 {
    public static void main(String[] args) {
        //    key               value
        //    name(String)       age(Integer)
        //    country(String)    capital(String)
        //    country(String)    cities(List)
        //    Integer             String
        //    Integer             Integer
        //     List               List
        ArrayList list = new ArrayList();
        list.add("Ronaldo");
        list.add(58);
        list.add(true);
        System.out.println("list = " + list);
        //Any reference type
        Student<Integer, Integer> student = new Student<>();
        student.number = 10;
        Student<String, Integer> student1 = new Student<>();
        student1.number = "One";
        ArrayList<Double> list1 = new ArrayList<>();

        HashMap<Integer, Integer> years = new HashMap<>();
        //        year     century

        years.put(2000, 21);
        years.put(1991, 20);
        years.put(1876, 15);
        // years.put(1876,19);
        years.replace(1876, 19);
        years.replace(2000, 2000);
        years.replace(2000, 21);
        years.remove(2000);
        years.put(1500, 16);

        System.out.println("years = " + years);


        // 5 country 5 capital
        //     Str       Str
        // capitals
        // Macedonia    Skopje
        // India        NewDelhi
        // Turkey       Ankara
        // UK           London
        // Germany      Berlin
        // Greece       Athens
//   Keeps insertion order
        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();
        //             Key     Value
        capitals.put("India", "NewDelhi");
        //             Key      Value
        capitals.put("Macedonia", "Skopje");
        capitals.put("Turkey", "Ankara");
        capitals.put("UK", "London");
        capitals.put("Germany", "Munich");
        System.out.println("capitals = " + capitals);
        capitals.replace("Germany", "Berlin");
        System.out.println("capitals = " + capitals);
        System.out.println("capitals.containsKey(\"Norway\") = " + capitals.containsKey("Norway"));
        System.out.println("capitals.containsValue(\"Ankara\") = " + capitals.containsValue("Ankara"));
        for (String country : capitals.keySet()) {
            System.out.println( country);
        }
     for(String city:   capitals.values()){
         System.out.println("value = " + city);
     }

        System.out.println("==============");
     //Access values by using key

        for (String country : capitals.keySet()) {
            System.out.println( country+" = "+ capitals.get(country));
        }
        System.out.println(capitals.get("germany"));
        System.out.println(capitals.get("Germany"));


    }
}
