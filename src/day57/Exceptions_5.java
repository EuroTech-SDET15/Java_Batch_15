package day57;

public class Exceptions_5 {


    public static void main(String[] args) {



    }

    public static void checkDriverAge(int age) throws DriverAgeException {
        if (age < 18) {
            throw new DriverAgeException("Age is not available ");
        }
    }
}
