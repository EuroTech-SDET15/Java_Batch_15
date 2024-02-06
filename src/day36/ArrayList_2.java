package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_2 {
    public static void main(String[] args) {
        //create an arraylist
        //names
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Cevahir", "Filiz", "Gulay", "Hasna", "Sarita"));
        System.out.println("names = " + names);
        names.add("Sneha");
        System.out.println("names = " + names);
        //print size
        //check the list whether Leyla is in the list or not?
        //Add Leyla index 2
        //Set   index 2 as Rosana
        System.out.println(names.size());
        System.out.println("names.contains(\"Leyla\") = " + names.contains("Leyla"));
        names.add(2, "Leyla");
        names.set(2, "Rosana");
        System.out.println("names = " + names);
        names.add("Sneha");
        System.out.println(names);
        System.out.println(names.indexOf("Sneha"));
        System.out.println(names.lastIndexOf("Sneha"));

        System.out.println(names);


        System.out.println("==============");
        for (String name : names) {
            System.out.println(name);
        }
        names.remove("Sneha");
        System.out.println(names);
        System.out.println("==================");
        //[Cevahir, Filiz, Rosana, Gulay, Hasna, Sarita, Sneha
        //   0          1       2     3      4       5       6

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        System.out.println(names.get(4));
        System.out.println(names.get(5));
        System.out.println(names.get(6));
        System.out.println("=======================");
        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
            System.out.println(names.get(i).substring(0, 2).toUpperCase());
        }








    }
}
