package day3.test;

import day53.AccessModifiers;

public class Access extends AccessModifiers {
    public static void main(String[] args) {
        //AccessModifiers accessModifiers = new AccessModifiers();
        //'AccessModifiers()' is not public in 'day53.AccessModifiers'.
        // Cannot be accessed from outside package
        // accessModifiers.number = 10;
        // accessModifiers.print();
        Access access = new Access();
        access.read();
        access.city = "London";
//        access.number = 20;'number' has private access in 'day53.AccessModifiers'
    }
}
