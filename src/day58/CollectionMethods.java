package day58;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionMethods {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);

        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.addAll(numbers);
        System.out.println("numbers2 = " + numbers2);

        numbers2.clear();
        System.out.println("numbers2 = " + numbers2);


        System.out.println("numbers.contains(11) = " + numbers.contains(11));
        System.out.println("numbers.contains(111) = " + numbers.contains(111));

        numbers2.add(33);
        numbers2.add(22);
        numbers2.add(11);

        System.out.println("numbers = " + numbers);
        System.out.println("numbers2 = " + numbers2);

        System.out.println("numbers.equals(numbers2) = " + numbers.equals(numbers2));

        System.out.println("numbers2.isEmpty() = " + numbers2.isEmpty());

        numbers2.remove((Integer) 33); //numbers2.remove(0)
        System.out.println("numbers2 = " + numbers2);
        numbers2.removeAll(Arrays.asList(11,22));
        System.out.println("numbers2 = " + numbers2);

        System.out.println("numbers2.isEmpty() = " + numbers2.isEmpty());

        numbers2.addAll(numbers);
        System.out.println("\n////////////////////////");
        numbers2.add(44);
        numbers.add(55);
        System.out.println("numbers = " + numbers);
        System.out.println("numbers2 = " + numbers2);

        System.out.println("numbers.retainAll(numbers2) = " + numbers.retainAll(numbers2));
        System.out.println("numbers = " + numbers);
        System.out.println("numbers2 = " + numbers2);
    }
}
