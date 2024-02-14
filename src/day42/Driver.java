package day42;

public class Driver {

    // instance fields
    String name;
    String surname;
    int licenceNumber;

    // static field
    static int driverCount;

    public Driver(){
        driverCount ++;
    }

    public void printDriverFullName(){
        System.out.println
       ("Driver Full Name: " + name+ " "+ surname);
    }

}
