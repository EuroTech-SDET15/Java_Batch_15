package day40;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_1 {
    public static void main(String[] args) {
        String name = "Ronaldo";
        String firstName = name;
        name = "Messi";
        System.out.println("name = " + name);//Messi
        System.out.println("firstName = " + firstName);//Ronaldo
        //strings immutable
        // arraylist mutable
        ArrayList<String> names = new ArrayList<>();
        names.add("Messi");
        names.add("Ali");
        names.add("Veli");
        ArrayList<String> players = names;
        System.out.println("players = " + players);
        players.add("Ronaldinho");
        System.out.println("players = " + players);
        System.out.println("names = " + names);


        print(names);
        changeFirstElement(names);
        System.out.println("names = " + names);
        String str="London";
        changeString(str);
        System.out.println("str = " + str);

    }

    public static void changeString(String str) {
        str = "Oslo";

    }

    public static void print(ArrayList<String> strings) {
        System.out.println("strings = " + strings);
    }

    public static void changeFirstElement(ArrayList<String> strings) {
        strings.set(0, "Levandowski");
    }
}
