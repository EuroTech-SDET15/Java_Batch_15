package day58;

import java.util.LinkedList;

public class LinkedListSample {

    public static void main(String[] args) {


        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(33);
        linkedList.add(-22);
        linkedList.add(11);
        linkedList.add(0);
        linkedList.add(222);

        System.out.println("linkedList = " + linkedList);

        linkedList.addFirst(555);

        System.out.println("linkedList = " + linkedList);



    }
}
