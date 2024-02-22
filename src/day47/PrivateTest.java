package day47;

import day47.PrivatePractice.SubClass2;

public class PrivateTest {
    public static void main(String[] args) {
//        name
        PrivatePractice obj1 = new PrivatePractice();
        System.out.println(obj1.name);

//        counter
        System.out.println(PrivatePractice.counter);
        System.out.println(obj1.counter);

//        privateCounter -> we cannot directly access!! it is private
//        System.out.println(PrivatePractice.cevahir);

//        printName()
        obj1.printName();

//        mySalary -> we cannot directly access!! it is private
//        System.out.println(obj1.mySalary);

//        getMySalary()
        obj1.getMySalary();

//        setMySalary() -> we cannot directly access!! it is private
//        obj1.setMySalary(1000,0.2);

//        editPayslip()
        obj1.editPayslip();

        //////////////////////////////////////////////////////////////////

        PrivatePractice.SubClass2 subObj2= obj1.new SubClass2();
//        PrivatePractice.SubClass1 subObj3= obj1.new SubClass1();

    }
}
