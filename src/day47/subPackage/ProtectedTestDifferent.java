package day47.subPackage;

import day47.ProtectedPractice;

public class ProtectedTestDifferent {

    public static void main(String[] args) {
//        name
        ProtectedPractice obj1 = new ProtectedPractice();
        System.out.println(obj1.name);

//        counter
        System.out.println(ProtectedPractice.counter);
        System.out.println(obj1.counter);

//        protectedCounter -> we cannot directly access!!
//        it is NOT in the same package!! AND NOT CHILD CLASS!!
//        System.out.println(ProtectedPractice.protectedCounter);

//        printName()
        obj1.printName();

//        mySalary -> we cannot directly access!!
//        it is NOT in the same package!! AND NOT CHILD CLASS!!
//        System.out.println(obj1.mySalary);

//        getMySalary()
        obj1.getMySalary();

//        setMySalary() -> we cannot directly access!!
//        it is NOT in the same package!! AND NOT CHILD CLASS!!
//        obj1.setMySalary(10000,0.2);

//        editPayslip()
        obj1.editPayslip();

//        defaultValue -> we cannot directly access!!
//        it is NOT in the same package!
//        System.out.println(obj1.defaultValue);

//        privateValue -> we cannot directly access!! it is Private!!!
//        System.out.println(obj1.privateValue);

    }


}
