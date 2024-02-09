package day39;

public class Test {
    public static void main(String[] args) {
        Player player1 = new Player("Ronaldo", 38);
        System.out.println("player1.name = " + player1.name);
        System.out.println(player1.age);//38
        Player player2 = new Player("Messi", 35);
        System.out.println(player2.age);//35
        player1.age = 50;
        System.out.println(player1.age);//50
        Player player3=new Player("Ali");
        System.out.println(player3.name);
        String str=new String("Hello");
    }
}
