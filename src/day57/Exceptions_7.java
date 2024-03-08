package day57;

public class Exceptions_7 {
    public static void main(String[] args) {
        try {
            Exceptions_5.checkDriverAge(10);//checked exceptions
        } catch (DriverAgeException d) {
          //  d.printStackTrace();
            d.printStackTrace();
        }
        System.out.println("Main method");
    }
}