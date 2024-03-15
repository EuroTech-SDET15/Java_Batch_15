package day62.employee;

public abstract class Employee {
//you can not create object 'Employee' is abstract, cannot be instantiated
//blueprint   define general methods in it

    Employee(String firstName, double salary) {
        this.name = firstName;
        this.salary = salary;
        System.out.println("Parent class constructor.");
    }


    private String name;
    int age;
    //    String profession;
    Professions profession;
    private double salary;

    public abstract void work();

    public void introduce() {
        System.out.println(name + " is " + age + " years old , and working as a " + profession);
    }

    public void setSalary(double s) {
        this.salary = s;
    }

    public double getSalary() {
        return salary;
    }


}
