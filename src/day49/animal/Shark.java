package day49.animal;

public class Shark extends Fish {


    @Override
    public void move() {
        System.out.println("Shark is swimming.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Shark makes Drumming sounds");
    }
}
