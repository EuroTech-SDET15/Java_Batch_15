package day52;

public class Calculator {


    public void write() {
        System.out.println("Hello");
    }

    public void write(int number) {
        System.out.println(number);
    }

    public void write(String str) {
        System.out.println(str);
    }

}

 class Test {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.write(10);
    }
}
