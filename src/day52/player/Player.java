package day52.player;

public abstract class Player extends Person {

    String teamName;
    int jerseyNumber;

    String country;

    Player(String name, int birthYear, char gender, String team,
           int jerseyNumber, String cntry) {
        super(name, birthYear, gender);
        this.teamName = team;
        this.jerseyNumber = jerseyNumber;
        this.country = cntry;
    }

    public void training() {
        System.out.println("Player running.");
    }

    public abstract void play();


}
