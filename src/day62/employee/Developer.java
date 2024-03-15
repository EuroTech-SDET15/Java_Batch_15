package day62.employee;

public class Developer extends Employee implements Manager,Coder {


    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Developing software!");
    }


    @Override
    public void manageMeetings() {
        System.out.println("Managing daily meetings!!!");
    }

    @Override
    public void makeCodereview() {
        System.out.println("Developer making code review of the other staff.");
    }

    @Override
    public void code() {
        System.out.println("Developer writing code for android app!!");
    }
}
