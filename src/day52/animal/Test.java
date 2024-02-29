package day52.animal;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();

        Animal animal = new Animal();

        Animal animal1 = new Cat();//cat is an animal
        animal1.makeSound();
        Animal animal2 = new Animal();
        animal2.makeSound();//Animals make sounds
        animal2 = new Cat();
        animal2.makeSound();//Cats meowww
        animal2 = new Dog();
        animal2.makeSound();//Dogs barking
        cat.name = "Garfield";
        Dog dog = new Dog();
        dog.name = "Bingo";
//        printCatName(cat);
//        printDogName(dog);
        printName(cat);
        printName(dog);

        ArrayList<Cat> catList = new ArrayList<>();
        ArrayList<Dog> dogList = new ArrayList<>();

        Lion lion = new Lion();
        lion.name = "king";
        ArrayList<Animal> animalList = new ArrayList<>();

        animalList.add(cat);
        animalList.add(dog);
        animalList.add(lion);

        System.out.println("animalList.get(0).name = " + animalList.get(0).name);
        System.out.println("animalList.get(1).name = " + animalList.get(1).name);
        System.out.println("animalList.get(2).name = " + animalList.get(2).name);

    }

    public static void printName(Animal animal) {
        System.out.println("animal.name = " + animal.name);
    }

//    public static void printCatName(Cat cat) {
//        System.out.println("cat.name = " + cat.name);
//    }
//
//    public static void printDogName(Dog dog) {
//        System.out.println("dog.name = " + dog.name);
//    }
}
