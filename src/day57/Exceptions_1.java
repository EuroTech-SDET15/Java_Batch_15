package day57;

public class Exceptions_1 {
    public static void main(String[] args) {
        String city = "Leicester";
//        System.out.println(city.toUpperCase());

        try {
            printStringUppercase(city);
            printStringUppercase("Oslo");

        } catch (Exception n) {
            n.printStackTrace();
            //   System.out.println("There is a problem for string value!!!");
        }
        System.out.println("After method calling.");
        System.out.println("End of main method!!!");
    }

    public static void printStringUppercase(String str) {
        System.out.println(str.toUpperCase());
        System.out.println("str.charAt(5) = " + str.charAt(5));
    }
}
