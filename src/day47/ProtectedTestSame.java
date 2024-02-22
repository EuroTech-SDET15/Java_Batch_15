package day47;

public class ProtectedTestSame {
    public static void main(String[] args) {
//        name
        ProtectedPractice obj1 = new ProtectedPractice();
        System.out.println(obj1.name);

//        counter
        System.out.println(ProtectedPractice.counter);
        System.out.println(obj1.counter);

//        protectedCounter -> we can directly access!! it is in the same package!!
        System.out.println(ProtectedPractice.protectedCounter);

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

//        defaultValue -> we can directly access!! it is in the same package!!
        System.out.println(obj1.defaultValue);

//        privateValue -> we cannot directly access!! it is Private!!!
//        System.out.println(obj1.privateValue);

    }
}
