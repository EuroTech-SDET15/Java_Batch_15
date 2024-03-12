package day59;

import java.util.ArrayList;
import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>(Arrays.asList("Red","Green","Orange","White","Black"));

        colours.set(2,"Yellow");
        System.out.println("colours.indexOf(\"Talha\") = " + colours.indexOf("Talha"));

       ArrayList<String> subColours= (ArrayList) colours.subList(0,3);
    }
}
