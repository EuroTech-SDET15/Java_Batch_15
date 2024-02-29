package day52.player;

public class FootballPlayer extends Player {


    FootballPlayer(String name, int birthYear, char gender,
                   String team, int jerseyNumber, String cntry) {
        super(name, birthYear, gender, team, jerseyNumber, cntry);
    }

    public void play() {
        System.out.println(name + " is playing football.");
    }

}
