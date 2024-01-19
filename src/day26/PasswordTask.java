package day26;

import java.util.Scanner;

public class PasswordTask {

    public static void main(String[] args) {

        askPassword();

    }
    public static void askPassword() {

        int keyword = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Please enter your password!!!"));

        if (scanner.hasNextInt()) {

            keyword = scanner.nextInt();
            passwordFind(keyword, 4);

        } else {

            scanner.nextLine();

            System.out.println("Please enter numeric number");
            keyword = scanner.nextInt();
            passwordFind(keyword, 2);
        }
    }


    public static void passwordFind(int num, int count) {

        int counter = 1;
        int password = 469;

        while (num != password && counter < count) {

            System.out.println("Wrong password!! Please re enter the password: ");
            Scanner scan = new Scanner(System.in);
            num = scan.nextInt();
            counter++;

        }

        if (num == password)
            System.out.println("WELCOME TO OUR BANK !!!");
        else
            System.out.println("YOU BANNED!!! ");

    }
}
