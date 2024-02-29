package day27;

import day22.Calculation;
import day23.Car;

public class Test {
    protected void finalize() throws Throwable {
        System.out.println("garbage collector");
        super.finalize();
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test test2 = new Test();
        test = test2;
        System.gc();
    }
}
