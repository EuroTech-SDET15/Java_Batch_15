package day52.player;

public class Test {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("Ronaldo", 1995, 'M', "Real"
                , 10, "Spain");
        footballPlayer.play();

        Player player = new FootballPlayer("David", 1999, 'M',
                "Liverpool", 5, "UK");
        Person person = new FootballPlayer("Marry", 2003, 'F',
                "Hamburg", 7, "Germany");


//        new FootballPlayer("David", 1999, 'M',
//                "Liverpool", 5, "UK");
//        new Person("ALi", 123, 'M');

        System.out.println( new String("Hello"));
        System.out.println( new String("Hello").toUpperCase());


    }
}
