package day26;

import java.util.Random;

public class RandomTask1 {

    public static void main(String[] args) {

        Random random = new Random();
        int number;
        do{
            number = random.nextInt(0,100);
            System.out.println("Random number is " + number);
        }while (number<=90);

        System.out.println("STOP!!, You exceed to max number! ");


    }
}
