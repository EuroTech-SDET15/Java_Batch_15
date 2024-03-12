package day59;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class CollectionsMethods {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(0,1,2,3));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(2,3,4,5));

        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(22,33,44,55));
        System.out.println("arrayList1 = " + arrayList1);
        System.out.println("arrayList2 = " + arrayList2);
        System.out.println("hashSet1 = " + hashSet1);

        Collections.addAll(arrayList1,11,22,33);
        System.out.println("arrayList1 = " + arrayList1);

        System.out.println("\n/////////////////////////////////");
        Collections.addAll(hashSet1,11,22,33,44);
        System.out.println("hashSet1 = " + hashSet1);

        System.out.println("\n/////////////////////////////////");
        Collections.sort(arrayList1);
        System.out.println("arrayList1 = " + arrayList1);
        System.out.println("Collections.binarySearch(arrayList1,11) = " + Collections.binarySearch(arrayList1, 11));
        System.out.println("Collections.binarySearch(arrayList1,11) = " + Collections.binarySearch(arrayList1, 111));

        System.out.println("\n/////////////////////////////////");
        System.out.println("arrayList2 = " + arrayList2);
        Collections.fill(arrayList2,22);
        System.out.println("arrayList2 = " + arrayList2);


        System.out.println("\n/////////////////////////////////");
        Collections.addAll(arrayList1, 11,22,33,11,11,11,22,33,1,2);
        System.out.println("arrayList1 = " + arrayList1);
        System.out.println("Collections.frequency(arrayList1,11) = " + Collections.frequency(arrayList1, 11));
        System.out.println("Collections.frequency(arrayList1,111) = " + Collections.frequency(arrayList1, 111));


        System.out.println("\n/////////////////////////////////");
        System.out.println("Collections.max(arrayList1) = " + Collections.max(arrayList1));


        System.out.println("\n/////////////////////////////////");
        Collections.replaceAll(arrayList1,33,303);
        System.out.println("arrayList1 = " + arrayList1);


        System.out.println("\n/////////////////////////////////");
    }
}
