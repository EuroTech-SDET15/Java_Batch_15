package day13;

import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class Burger {
    //scanner
    //what size burger you want   small medium double
    //drink       tea water fruit juice
    //print what customer wants and cost of the drink and burger

    public static void main(String[] args) {
        System.out.println("Welcome Java Burger!!!!");
        System.out.println("What size burger do you want?");
        System.out.println("We have small, medium and double");
        System.out.println("If you want small one click on s ; if you want medium click on m " +
                "if you want double click on d");
        Scanner scanner = new Scanner(System.in);
        String burgerSize = scanner.next();
        double cost = 0;
        switch (burgerSize) {
            case "s":
                System.out.println("you have selected small burger!!!");
                //3
                cost = 3;
                break;
            case "m":
                System.out.println("You have selected medium burger!!");
                //4
                cost = 4;
                break;
            case "d":
                System.out.println("You have selected double burger, Good choice!!!!");
                cost = 5;
                break;
            default:
                System.out.println("You have not selected any burger!!!!");
                System.out.println("Invalid burger::))");
        }
        System.out.println("What would you like to drink?");
        System.out.println("If you want to drink tea click on 1");
        System.out.println("If you want to drink water click on 2");
        System.out.println("If you want to drink fruit juice click on 3");

        int drink = scanner.nextInt();
        String fruitJuice = "";
        if (drink == 3) {
            System.out.println("Which fruit juice do you want ");
            System.out.println("for apple click a, for orange click o, for lemon clik on l, for mix click on m");
            fruitJuice = scanner.next();
        }

        switch (drink) {
            case 1:
                System.out.println("Good choice , you have selected tea, enjoy!");
                //2     burgerprice + tea price
                cost = cost + 2;
                break;
            case 2:
                System.out.println("You want to drink water, well done!!");
                //1
                cost = cost + 1;
                break;
            case 3:
                //2.5
                cost = cost + 2.5;
                switch (fruitJuice) {//nested switch statement
                    case "a":
                        System.out.println("You selected apple juice");
                        break;
                    case "o":
                        System.out.println("You selected orange juice");
                        break;
                    case "l":
                        System.out.println("you selected lemon juice ");
                        break;
                    case "m":
                        System.out.println("You selected mix fruit juice!!!");
                    default:
                        System.out.println("you want to drink fruit juice but you couldnt select right option::((");
                }
                break;
            default:
                System.out.println("You dont want to drink any think!!!!");
        }
        System.out.println("now time to pay::))) it cost " + cost + " £");

    }
}
