package day39;

public class Player {

    String name;
    int age;
    String team;

    Player(String firstName, int age) {
        System.out.println("Player object generated.");
        this.name = firstName;
        this.age = age;
    }

    Player(String firstName) {
        this.name = firstName;
    }


}
