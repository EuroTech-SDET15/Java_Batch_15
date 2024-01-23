package day27;

import day22.Calculation;
import day23.Car;

public class String_1 {
    public static void main(String[] args) {
        //byte short int long float double char boolean  ===> primitive data types
        //reference types ==> variable of class types is called reference types
        //reference variables hold address of the object-refer objects
        Calculation calculation;
        calculation = new Calculation();
        Car car1 = new Car();
        int number = 20;
        String str = "Hello";
        System.out.println("Oslo");

        String capital = "Oslo";
        String city = new String("Oslo");
        System.out.println("str = " + str);
        System.out.println("city = " + city);

        int num = 20;
        if (city == capital) {
            System.out.println("String values  same.");
        } else {
            System.out.println("String values not same.");
        }
        if (city == "Oslo") {
            System.out.println("String values  same.");
        } else {
            System.out.println("String values not same.");
        }
        if (capital == "Oslo") {
            System.out.println("Same object.");
        } else {
            System.out.println("Different object.");
        }
        String city2 = "Oslo";
        System.out.println("city2==capital = " + (city2 == capital));
        System.out.println("city==capital = " + (city == capital));
        String city10 = new String("Oslo");
        System.out.println("city10==city = " + (city10 == city));

        System.out.println("=============================");
        String name;//literal
        String firstName;//new
        String secondName;//literal
        String thirdName;//new
        name = "David";
        firstName = new String("David");
        secondName = "David";
        thirdName = new String("David");


        System.out.println("name==firstName = " + (name == firstName));
        System.out.println("name==secondName = " + (name == secondName));
        System.out.println("firstName==thirdName = " + (firstName == thirdName));

//reference variables hold adress of the objects
    }
}
