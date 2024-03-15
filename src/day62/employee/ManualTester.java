package day62.employee;

public class ManualTester extends Tester {
    ManualTester(String firstName, double salary) {
        super(firstName, salary);
    }

    @Override
    public void work() {
        System.out.println("Writing test cases and testing!!");
    }
}
