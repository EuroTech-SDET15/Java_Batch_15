package day58;

import java.util.ArrayList;
import java.util.Arrays;

public class Tasks {

    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>(Arrays.asList("Red","Green","Orange","White","Black"));

        ArrayList<String> returnList = new ArrayList<>(Arrays.asList("Pink"));

        returnList.addAll(colours);

        System.out.println("returnList = " + returnList);
    }
}
