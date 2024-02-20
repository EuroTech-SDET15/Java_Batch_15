package day45.animal;

public class AnimalTest {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        Animal animal2 = new Animal();

        Cat cat = new Cat("Garfield", "Domestic");
//        cat.species = "Domestic";
        cat.age = 3;
        cat.color = "yellow";
        cat.eat();
        System.out.println(cat.toString());
//
        Bird bird = new Bird("HappyBird", "Parrots");
//        bird.name = "happy";
//        bird.species = "Parrots";
        bird.age = 2;
        bird.makeSound();
        System.out.println(bird.toString());
//
//        //Animal class is parent class, super class
//        //Cat, Bird classes are child class, sub class, derived class
//        bird.isFlying = true;
//        cat.climbing();

        Cat cat2 = new Cat("SnowBall", "British Shorthair");


//        Animal animal=new Animal("Rocky");


    }
}
