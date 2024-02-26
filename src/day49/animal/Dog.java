package day49.animal;

public class Dog extends Animal {


    public void move() {
        System.out.println("Dog is running.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is  barking.");
    }


}
