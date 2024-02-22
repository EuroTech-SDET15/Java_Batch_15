package day47;

public class DefaultPractice {


    public String name= "Default Name";  // instance
    double mySalary;
    public static int counter; // class / static variable
    static int defaultCounter; // class / static variable


    public void printName(){
        System.out.println("My object's name = " + name);
    }

    public double getMySalary() {
        return mySalary;
    }

    void setMySalary(double salary, double taxRate){
        this.mySalary = salary - (salary*taxRate);
    }

    public void editPayslip(){
        // do another process
        setMySalary(10000,0.05);
        // do another process
    }
}
