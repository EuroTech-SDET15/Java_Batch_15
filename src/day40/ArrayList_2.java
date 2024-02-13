package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_2 {
    public static void main(String[] args) {
        //proLanguages
        //Java JavaScript Python Html TypeScript

        String[] languages = {"java", "JavaScript", "Python", "Html", "TypeScript"};
        ArrayList<String> proLanguages = new ArrayList<>(Arrays.asList(languages));
        proLanguages.set(1, "C++");
        System.out.println("proLanguages = " + proLanguages);
        System.out.println("proLanguages.size() = " + proLanguages.size());
        //print last element capital
        System.out.println("proLanguages.get(4).toUpperCase() = " + proLanguages.get(4).toUpperCase());

        printLastElementCapital(proLanguages);
        ArrayList<String> names = new ArrayList<>(Arrays.asList("David", "Marry"));
        printLastElementCapital(names);
//        Java, C++, Python, Html, TypeScript
        // 0     1      2       3       4
        System.out.println("proLanguages = " + proLanguages);
        proLanguages.add("JavaScript");
        System.out.println("proLanguages = " + proLanguages);
        //java, C++, Python, Html, TypeScript, JavaScript
        String language = "JAVA";//true
        System.out.println(proLanguages.contains(language));
        System.out.println(proLanguages.contains(language.toLowerCase()));
        //Script  is in the list TypeScript  JavaScript

        System.out.println(proLanguages.contains("Script"));
        int counter = 0;
        for (String element : proLanguages) {
            if (element.contains("Script")) {
                //  System.out.println("there is Script inside the elements ");
                counter++;
                //  break;
            }
        }
        //index numbers of those elements
        System.out.println("Script is passing " + counter + " times in the ArrayaList elements.");
        System.out.println(proLanguages.get(0).contains("Script"));

        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" Ronalldo");
        System.out.println("stringBuffer = " + stringBuffer);


    }

    public static void printLastElementCapital(ArrayList<String> strings) {
        System.out.println(strings.get(strings.size() - 1).toUpperCase());
    }


}
