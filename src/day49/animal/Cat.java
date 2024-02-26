package day49.animal;

public class Cat extends Animal{


    @Override
    public void move() {
        System.out.println("Cat walking.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cats meows");
    }
}
