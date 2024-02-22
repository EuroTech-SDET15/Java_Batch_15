package day44.Filiz;

import java.util.Scanner;


public class Staff1Test {

    public static void main(String[] args) {

        registerStaff();

    }
    public static void registerStaff() {

        Staff1 staff1 = new Staff1();

        if (Staff1.flag)
            System.out.println(staff1);
        else
            System.out.println("Pasword is not correct !!!!");


        Staff1 staff2 = new Staff1();
        if (staff2.flag)
            System.out.println(staff2);
        else
            System.out.println("Pasword is not correct !!!!");
    }
}
