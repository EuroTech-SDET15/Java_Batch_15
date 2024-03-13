package day60.thread;

public class MultiThreadExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.start();
        Printer printer1 = new Printer();
        printer1.start();
        Printer printer2 = new Printer();
        printer2.start();
    }
}
