package day59;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SetSample {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(111);
        hashSet.add(1);
        hashSet.add(11);
        hashSet.add(222);
        hashSet.add(123);
        hashSet.add(0);

        hashSet.add(111);
        hashSet.add(1);
        hashSet.add(11);
        hashSet.add(222);
        hashSet.add(123);
        hashSet.add(0);
        hashSet.add(0000);
        hashSet.add(-1);
        hashSet.add(-1);

        System.out.println("hashSet = " + hashSet);

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(33,2,0,-1,-11,-222,33,2,-11,-1));

        System.out.println("arrayList = " + arrayList);

        HashSet<Integer> hashSet2 = new HashSet<>(arrayList);
        System.out.println("hashSet2 = " + hashSet2);


    }

}
