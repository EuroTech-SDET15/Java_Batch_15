package day60;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Maps_1 {
    public static void main(String[] args) {
        //  95   96  97  90  92
        ArrayList<Integer> javaScores = new ArrayList<>();
        javaScores.add(95);//Cevahir, 95
        javaScores.add(96);//Filiz, 96
        javaScores.add(97);//Gulay, 97
        javaScores.add(90);//Sarita,90
        javaScores.add(92);//Sneha, 92

        //Key             Value
        //names           scores
        //Cevahir          95
//                Key     Value
        HashMap<String, Integer> javaGrades = new HashMap<>();
        javaGrades.put("Cevahir", 95);
        javaGrades.put("Filiz", 96);
        javaGrades.put("Gulay", 97);
        javaGrades.put("Sarita", 90);
        javaGrades.put("Sneha", 92);

        System.out.println("javaGrades = " + javaGrades);//will not keep insertion order
        javaGrades.put("Rosana", 94);
        System.out.println("javaGrades = " + javaGrades);
        javaGrades.put("Sarita", 97);
        System.out.println("javaGrades = " + javaGrades);
        //keys unique   key will not accept duplicate but for value duplicate is fine

        System.out.println("javaGrades.keySet() = " + javaGrades.keySet());
        System.out.println("javaGrades.values() = " + javaGrades.values());

        javaGrades.put("Sneha", 96);
        System.out.println("javaGrades = " + javaGrades);
        javaGrades.put("Messi", 80);
        System.out.println("javaGrades = " + javaGrades);
        javaGrades.remove("Messi");
        System.out.println("javaGrades = " + javaGrades);

        System.out.println("javaGrades.get(\"Filiz\") = " + javaGrades.get("Filiz"));
        System.out.println("javaGrades.get(\"Cevahir\") = " + javaGrades.get("Cevahir"));
        System.out.println("javaGrades.get(\"Gulay\") = " + javaGrades.get("Gulay"));

        Set<String> names = javaGrades.keySet();

        for (String name : names) {
            System.out.println(name + " = " + javaGrades.get(name));
        }
        System.out.println("javaGrades = " + javaGrades);
        System.out.println("javaGrades.size() = " + javaGrades.size());
        System.out.println("javaGrades.get(\"sarita\") = " + javaGrades.get("sarita"));
        System.out.println("javaGrades.get(\"Sarita\") = " + javaGrades.get("Sarita"));
        javaGrades.replace("Rosana", 95);
        System.out.println("javaGrades = " + javaGrades);
        javaGrades.put("Rosana", 96);
        System.out.println("javaGrades = " + javaGrades);
        // javaGrades.clear();
        System.out.println("javaGrades = " + javaGrades);
        // HashMap<String, Integer> copied = javaGrades;
        HashMap<String, Integer> copied = new HashMap<>();
        System.out.println("copied = " + copied);
        copied.putAll(javaGrades);
        System.out.println("copied = " + copied);


    }
}
