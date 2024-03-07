package day56;

public class protectYourCode {

    public static void main(String[] args) {
        divisionCalculator(1, 1);
        divisionCalculator(1, 0);

    }

    public static void divisionCalculator(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Number 2 is 0");
            throw new ArithmeticException();
        }
        try {
            System.out.println("num1/num2 = " + num1 / num2);
        }catch (ArithmeticException e){
            throw new RuntimeException();
        }


    }
}
