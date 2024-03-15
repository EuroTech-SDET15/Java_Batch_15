package day62.employee;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Employee employee = new Employee();

        Developer developer = new Developer("David", 60000);
        developer.age = 30;
//        developer.salary = 60000;
//        developer.profession = "Developer";
        developer.profession = Professions.DEVELOPER;
        developer.introduce();
        // developer.salary = 75000;
        developer.setSalary(75000);
        System.out.println("developer.getSalary() = " + developer.getSalary());
        AutomationTester automationTester = new AutomationTester("Marry", 50000);
        automationTester.age = 35;
        //  tester.profession = "SDET";
        automationTester.profession = Professions.SDET;
        automationTester.introduce();

        ManualTester manualtester = new ManualTester("Mark", 55000);
        manualtester.age = 40;
        //  tester2.profession = "Basket player";
        manualtester.profession = Professions.MANUALTESTER;
        manualtester.introduce();

        developer.makeCodereview();
        developer.code();
        automationTester.code();
        printProgrammingLanguage(developer);
        printProgrammingLanguage(automationTester);
        // printProgrammingLanguage(manualtester);
//Developer AutomatinTester and ManualTester are Employee
//Developer AutomationTester are Coder
        //3 roles
        //Developer
        //SDET
        //Manual Tester

        //RED
        //AMBER
        //GREEN

        String lampColor = "Red";
        lampColor = "Black";

        TrafficLampsColors colors = TrafficLampsColors.AMBER;
        colors = TrafficLampsColors.RED;
//Use enums when you have values that you know aren't going to change,
// like month days, days, colors, deck of cards, etc.
        switch (colors) {
            case RED:
                System.out.println("You must wait!!!");
                break;
            case AMBER:
                System.out.println("Prepare to go!!!");
                break;
            case GREEN:
                System.out.println("Go!!!!");
        }

//      Reference Type           Object Type
        Coder coder = new AutomationTester("Ali", 50);
        Employee employee = new Developer("Ayse", 32);
        List<Integer> list = new ArrayList<>();
        List<String> list1 = new LinkedList<>();
        Map<String, String> maps = new HashMap<>();
    }

    public static void printProgrammingLanguage(Coder developer) {
        System.out.println("Writing code in " + Coder.programmingLanguage);
    }

    //                Employee  Abstract
    //      Developer                         Tester  Abstract
    //                                  Manual       Automation
}
