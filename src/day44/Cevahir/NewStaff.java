package day44.Cevahir;

import java.util.Scanner;

public class NewStaff {
    Scanner scanner = new Scanner(System.in);
    private static final String ADMIN_PASSWORD = "admin";
    public static boolean isScannerPassword;
    private int experienceYear;
    int staffId = 10000;
    String fullName;
    String role;
    private double salary;
    static int staffCount = 50;

    static {
        while (!isScannerPassword) {
            System.out.println("Please enter your HR password ");
            String password = new Scanner(System.in).nextLine();
            if (password.equals(ADMIN_PASSWORD)) {
                System.out.println("correct");
                isScannerPassword = true;
            } else {
                System.out.println("Unauthorized access!!");
            }
        }
    }

    public NewStaff() {
        System.out.println("\n\t -------------    Eurotech Ltd Welcome to HR Portal!!  ----------------\n" +
                "Please enter the new Staff full name:");
        this.fullName = scanner.nextLine();

        System.out.println("Please enter the new Staff role:");
        this.role = scanner.nextLine();

        setSalary();

        staffId += staffCount++;
        System.out.println(" Thank you! New staff " + fullName + " inserted our HR portal with staff id " + staffId + " salary : " + salary);
    }

     double getSalary() {
        if (experienceYear >= 5) {
            return salary;
        } else {
            return -1;
        }
    }

    public void setSalary() {

        System.out.print("Please enter the salary for \n new staff " + fullName + ": ");
        this.salary = scanner.nextDouble();
        System.out.println("Please enter your  experience year ");
        this.experienceYear = new Scanner(System.in).nextInt();
        if (experienceYear >= 5) {
            this.experienceYear = experienceYear;
            System.out.println("Experience added successfully!");
            this.salary *= 1.10;
        } else {
            System.out.println("Your experience is not enough to get a raise");
        }
    }

    @Override
    public String toString() {
        return "NewStaff{" +
                ", experienceYear=" + experienceYear +
                ", staffId=" + staffId +
                ", fullName='" + fullName + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}