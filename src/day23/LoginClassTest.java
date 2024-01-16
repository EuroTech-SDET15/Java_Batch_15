package day23;

import day22.Calculation;
import java.util.Scanner;

public class LoginClassTest {
    public static void main(String[] args) {
        LoginClass user1 = new LoginClass();
        user1.userName = "inspector";
        user1.password = "12345";
        user1.enterUserCredentials();
        user1.clickSubmitButton();
        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();
        Calculation calculation = new Calculation();

    }
}
