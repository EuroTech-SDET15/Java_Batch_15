package day53;

public class PrinterTest {
    public static void main(String[] args) {
        Device device = new Device();
        device.print("");

        Printer printer = (name) -> System.out.println("Hi "+name);

        printer.print("Marry");
        printer.print("David");
        printer.print("Michael");
    }
}
