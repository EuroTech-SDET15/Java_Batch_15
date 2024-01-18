package day25;

import java.util.Random;

public class RandomPractice {

    public static void main(String[] args) {
        Random random = new Random();

        int randomInteger = random.nextInt();

        System.out.println("randomInteger = " + randomInteger);

        // Get me a random number between [0-30]  [0 - 31)
       int guessNumber= random.nextInt(31);

        System.out.println("guessNumber = " + guessNumber);


        // What if I want to generate a number for dice [1-6]
       int dice1 = random.nextInt(1,7);
        System.out.println("dice1 = " + dice1);

       int dice2 = random.nextInt(1,7);
        System.out.println("re dice2 = " + dice2);

        System.out.println("My sum of dice is " + (dice1+dice2));

    }
}
