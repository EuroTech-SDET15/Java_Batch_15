package day11;

public class Task3 {

    public static void main(String[] args) {
        int balance = 120;
        int score = 8;

        if (score >=8){
            balance += 50;
        }

        if(score >6 && score<8){
            balance += 20;
        }

        if(score<6){
            balance -= 10;
        }

        System.out.println("balance = " + balance);
    }
}
