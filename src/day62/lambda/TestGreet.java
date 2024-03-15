package day62.lambda;

public class TestGreet implements Greet {
    @Override
    public void greet(String name) {
        System.out.println("Hello " + name);
    }
}
