package day51.animal;

public class Shark extends Animal implements Predator, Swimmer {

    Shark(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("Sharks singing songs!!!!");
    }

    @Override
    public void hunt() {
        System.out.println(super.name + " hunting seals!");
    }

    @Override
    public void moveFast() {
        System.out.println("Sharks swims fast to hunt!!!");
    }

    @Override
    public void swim() {
        System.out.println(name + " swimming in deep oceans.");
    }
}
