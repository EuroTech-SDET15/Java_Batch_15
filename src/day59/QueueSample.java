package day59;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {

    public static void main(String[] args) {

        PriorityQueue<String> countryCodes = new PriorityQueue<>();

        countryCodes.add("DE");
        countryCodes.add("US");
        countryCodes.add("BL");
        countryCodes.add("TR");
        countryCodes.add("UK");
        countryCodes.add("DE");

        System.out.println("countryCodes = " + countryCodes);

        countryCodes.offer("FR");

        System.out.println("Before pool countryCodes = " + countryCodes);

        countryCodes.poll();

        System.out.println("After pool countryCodes = " + countryCodes);

        countryCodes.poll();

        System.out.println("After 2. pool countryCodes = " + countryCodes);

        countryCodes.poll();

        System.out.println("After 3. pool countryCodes = " + countryCodes);

        System.out.println("countryCodes.comparator() = " + countryCodes.comparator());
    }
}
