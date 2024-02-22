package day47;

public class PrivatePractice { // outer class

    public String name= "Default Name";  // instance
    private double mySalary;
    public static int counter; // class / static variable
    private static int cevahir; // class / static variable


    public void printName(){
        System.out.println("My object's name = " + name);
    }

    public double getMySalary() {
        return mySalary;
    }

    private void setMySalary(double salary, double taxRate){
        this.mySalary = salary - (salary*taxRate);
    }

    public void editPayslip(){
        // do another process
        setMySalary(10000,0.05);
        // do another process
    }

    private class SubClass1{  // nested inner class

    }

    public class SubClass2 {  // nested inner class

    }
}

class ClassB {


}
