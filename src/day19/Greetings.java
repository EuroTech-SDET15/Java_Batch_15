package day19;

public class Greetings {


    //morningGreeting ===> good morning
    //eveningGreeting ===>good evening
    public static void main(String[] args) {
        int hour = 20;
        if (hour < 12) {
            morningGreeting();
        } else if (hour < 18) {
            noonGreeting();
        } else {
            eveningGreeting();
        }
    }

    public static void morningGreeting() {
        System.out.println("Good morning!!");
    }

    static void noonGreeting() {
        System.out.println("Good afternoon!!");
    }

    static void eveningGreeting() {
        System.out.println("Good evening!!");
        System.out.println("Good bye!!");
    }


}
