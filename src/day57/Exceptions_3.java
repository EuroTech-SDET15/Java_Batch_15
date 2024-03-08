package day57;

public class Exceptions_3 {
    public static void main(String[] args) {
        int a;
        try {
             a = Integer.parseInt("Oslo");
        } catch (Exception n) {
         //   n.printStackTrace();
        }
        System.out.println("After try-catch");


    }
}
