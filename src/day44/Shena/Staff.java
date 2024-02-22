package day44.Shena;

import java.util.Scanner;

public class Staff {
        Scanner scanner = new Scanner(System.in);

        private static final String ADMIN_PASSWORD= "admin";
        int staffId= 10000;
        static boolean access = false;
        String fullName;
        String role;
        private double salary;
        static int staffCount=50;
        static {
            int counter = 3;
            while (!access && counter>0) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter your HR password:");
                String password = scanner.nextLine();
                if(password.equals(ADMIN_PASSWORD)){
                    System.out.println("Correct Password");
                    access = true;
                }else
                    System.out.println("Unauthorized access!!");
                counter--;
            }
        }

        public Staff() {
            System.out.println("\n\t -------------    Eurotech Ltd Welcome to HR Portal!!  ----------------\n" +
                    "Please enter the new Staff full name:");
            this.fullName = scanner.nextLine();

            System.out.println("Please enter the new Staff role:");
            this.role = scanner.nextLine();

            staffId += staffCount++;
            System.out.println("Thank you! New staff "+ fullName+" inserted our HR portal with staff id "+ staffId);

            System.out.println("Please enter your new staff Salary:");
            this.salary = scanner.nextDouble();
            System.out.println("New Salary saved!!! \n");
        }


        public double getSalary() {
          return salary;
        }

        public void setSalary(double salary) {
               this.salary=salary;
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


