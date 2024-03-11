package day58;

import java.util.Vector;

public class VectorSample {

    public static void main(String[] args) {

        Vector<Integer> vectorList=new Vector<>();
        vectorList.add(33);
        vectorList.add(1);
        vectorList.add(22);
        vectorList.add(0);
        vectorList.add(-10);

        System.out.println("vectorList = " + vectorList);

        vectorList.insertElementAt(-11,2);
        System.out.println("vectorList = " + vectorList);


    }
}
