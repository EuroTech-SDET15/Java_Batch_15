package day25;

import java.util.Random;

public class RandomBoolean {

    public static void main(String[] args) {

        Random random = new Random();
        boolean shouldIDO = random.nextBoolean();

        System.out.println("should I DO = " + shouldIDO);
    }
}
