package day49.animal;

public class Dolphin extends Fish{


    @Override
    public void move() {
        System.out.println("Dolphins swimmming and jumping!!!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dolphins singing!!!");
    }
}
