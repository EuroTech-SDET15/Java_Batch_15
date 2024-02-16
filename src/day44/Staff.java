package day44;

import java.util.Scanner;

public class Staff {
    Scanner scanner = new Scanner(System.in);

    private final String ADMIN_PASSWORD= "admin";
    int staffId= 10000;

    String fullName;

    String role;

    private double salary;

    static int staffCount=0;


    public Staff() {
        System.out.println("\n\t -------------    Eurotech Ltd Welcome to HR Portal!!  ----------------\n" +
                "Please enter the new Staff full name:");
        this.fullName = scanner.nextLine();

        System.out.println("Please enter the new Staff role:");
        this.role = scanner.nextLine();

        staffId += staffCount++;
        System.out.println(" Thank you! New staff "+ fullName+" inserted our HR portal with staff id "+ staffId);

        System.out.println("Please enter your HR password to add new staff Salary:");
        String password= scanner.nextLine();
        setSalary(password);
    }


    public double getSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your HR password to see staff's Salary:");
        String password= scanner.nextLine();
        if(password.equals(ADMIN_PASSWORD)) {
            System.out.println("Password correct");
            System.out.println("salary = " + salary);
            return salary;
        } else{
            System.out.println("Unauthorized access!!");
            return -1;
        }

    }

    public void setSalary(String password) {
        if(password.equals(ADMIN_PASSWORD)) {
            System.out.println("Password correct, now please enter SALARY:");
            this.salary = scanner.nextDouble();
            System.out.println("New Salary saved!!! \n");
        } else{
            System.out.println("Unauthorized access!!");
        }
    }

    @Override
    public String toString() {
        return "Staff{" +
                ", staffId=" + staffId +
                ", fullName='" + fullName + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
