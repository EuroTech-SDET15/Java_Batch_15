package day25;

import java.util.Random;

public class LoopWithRandom {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            System.out.println("iteration: " + i);
            System.out.println("Java");
            System.out.println("random.nextInt() = " + random.nextInt());
        }

    }
}
