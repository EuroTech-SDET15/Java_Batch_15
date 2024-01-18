package day25;

import java.util.Random;

public class Manual2RangeRandom {


    public static void main(String[] args) {


        // dice [1,7)

        Random random = new Random();

        int low = 1;
        int high= 7;

        System.out.println("Dice " + (random.nextInt(high - low) + low));
        System.out.println("Dice " + (random.nextInt(7-1) + 1));

        System.out.println("random.nextInt(1,7) = " + random.nextInt(1, 7));


    }
}
