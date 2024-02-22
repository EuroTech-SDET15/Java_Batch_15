package day46;

import day47.DefaultPractice;

public class DefaultTestDifferent {

    public static void main(String[] args) {
        DefaultPractice obj1 = new DefaultPractice();

//        name
        System.out.println(obj1.name);

//        counter
        System.out.println(DefaultPractice.counter);
        System.out.println(obj1.counter);

//        defaultCounter -> we cannot directly access!! it is NOT in the same package!!
//        System.out.println(DefaultPractice.defaultCounter);
//        System.out.println(obj1.defaultCounter);

//        printName()
        obj1.printName();

//        mySalary -> we cannot directly access!! it is NOT in the same package!!
//        System.out.println(obj1.mySalary);

//        getMySalary()
        System.out.println(obj1.getMySalary());

//        setMySalary() -> we cannot directly access!! it is NOT in the same package!!
//        obj1.setMySalary(10000,0.2);

//        editPayslip()
        obj1.editPayslip();

    }
}
