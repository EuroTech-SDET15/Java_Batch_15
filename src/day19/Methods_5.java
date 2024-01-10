package day19;

public class Methods_5 {
    public static void main(String[] args) {
        System.out.println("Hello from main method!!!");
        lesson();
        System.out.println("End of main method");

    }
    //5 12 17 7

    static void morning() {
        System.out.println("Good morning");
    }

    static void lesson() {
        morning();
        System.out.println("Have a nice lesson!!!");
    }
}
