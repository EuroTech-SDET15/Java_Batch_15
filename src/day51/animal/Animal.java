package day51.animal;

public abstract class Animal {
    String name;


    Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public abstract void makeSound();


}
