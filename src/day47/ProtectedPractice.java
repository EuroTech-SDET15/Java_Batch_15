package day47;

public class ProtectedPractice {

    public String name= "Default Name";  // instance
    protected double mySalary;
    public static int counter; // class / static variable
    protected static int protectedCounter; // class / static variable

    int defaultValue; // default!!
    private int privateValue;


    public void printName(){
        System.out.println("My object's name = " + name);
    }

    public double getMySalary() {
        return mySalary;
    }

    protected void setMySalary(double salary, double taxRate){

        this.mySalary = salary - (salary*taxRate);
    }

    public void editPayslip(){
        // do another process
        setMySalary(10000,0.05);
        // do another process
    }
}
