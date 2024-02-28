package day51.interfaces;

import day51.interfaces.B;

public class C implements B {



    public void write() {
        System.out.println("Write C");
    }

    @Override
    public int add(int number) {
        number = number * 10;
        return number;
    }
}
