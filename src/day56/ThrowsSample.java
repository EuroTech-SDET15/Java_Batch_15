package day56;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsSample {


    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println(1);
        sleepCode(1);
        System.out.println(2);
        sleepCode(1);
        System.out.println(3);
        pauseCode(1);
        FileWriter fileWriter = new FileWriter(new File("src/text.txt"));
        fileWriter.write("");
    }


    public static void sleepCode(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    public static void pauseCode(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            // do what ever you need!!
        }
    }

}
