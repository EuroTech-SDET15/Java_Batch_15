package day53;

public class AccessTest {
    public static void main(String[] args) {
        //if you make constructor private then not possible to create object in any other classes
        AccessModifiers accessModifiers = new AccessModifiers();
       // accessModifiers.number = 50;
       // accessModifiers.print();
        accessModifiers.read();

    }
}
