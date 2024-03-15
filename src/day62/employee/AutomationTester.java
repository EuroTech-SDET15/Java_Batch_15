package day62.employee;

public class AutomationTester extends Tester implements Coder{


    AutomationTester(String firstName, double salary) {
        super(firstName, salary);
    }

    @Override
    public void work() {
        System.out.println("Automating test scenarios!!!");
    }

    @Override
    public void code() {
        System.out.println("Writing code to automate test scenarios!!!!");
    }
}
