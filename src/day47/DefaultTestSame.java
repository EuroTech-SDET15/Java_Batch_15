package day47;

public class DefaultTestSame {

    public static void main(String[] args) {
//        name
        DefaultPractice obj1 = new DefaultPractice();
        System.out.println(obj1.name);

//        counter
        System.out.println(DefaultPractice.counter);
        System.out.println(obj1.counter);

//        defaultCounter -> we can directly access!! it is in the same package!!
        System.out.println(DefaultPractice.defaultCounter);

//        printName()
        obj1.printName();

//        mySalary -> we can directly access!! it is in the same package!!
        System.out.println(obj1.mySalary);

//        getMySalary()
        obj1.getMySalary();

//        setMySalary() -> we can directly access!! it is in the same package!!
        obj1.setMySalary(10000,0.2);

//        editPayslip()
        obj1.editPayslip();


    }
}
