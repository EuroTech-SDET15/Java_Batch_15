
package day44.Filiz;

import java.util.Scanner;

public class Staff1 {
    Scanner scanner = new Scanner(System.in);

    private static final String ADMIN_PASSWORD = "admin";
    int staffId = 10000;

    String fullName;

    String role;

    private double salary;

    static int staffCount = 50;
    static boolean flag ;

    static {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your HR password ");
        String password = scanner.nextLine();
        flag = password.equals(ADMIN_PASSWORD);
        if (flag) {
            System.out.println("You can register  ");
        } else {
            System.out.println("Unauthorized access!!");
        }

    }

    public Staff1() {

         if (flag){

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("\n\t -------------   Eurotech Ltd Welcome to HR Portal!!  ----------------\n" +

                    "Please enter the new Staff full name:");
            this.fullName = scanner.nextLine();

            System.out.println("Please enter the new Staff role:");
            this.role = scanner.nextLine();

            staffId += ++staffCount;
            System.out.println("Thank you! New staff " + fullName + " inserted our HR portal with staff id " + staffId);


            setSalary();
          } else {
            System.out.println("Password is not correct");
          }
     }


    public double getSalary() {

        return salary;

    }

    public void setSalary() {

        System.out.println("\nNow please enter SALARY:");
        this.salary = scanner.nextDouble();
        System.out.println("New Salary saved!!! \n");

    }

    @Override
    public String toString() {
        return "Staff{" +
                "  staffId=" + staffId +
                ", fullName='" + fullName + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
