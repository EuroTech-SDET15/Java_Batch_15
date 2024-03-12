package day59;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SortedSetSample {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(33,2,0,-1,-11,-222,33,2,-11,-1));
        System.out.println("arrayList = " + arrayList);

        TreeSet<Integer> treeSet = new TreeSet<>(arrayList);
        System.out.println("treeSet = " + treeSet);
    }
}
