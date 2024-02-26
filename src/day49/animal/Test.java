package day49.animal;

public class Test {
    public static void main(String[] args) {
        //you can not generate object from abstract class
//        Animal animal = new Animal();  'Animal' is abstract; cannot be instantiated

        Dog dog = new Dog();
        dog.name = "Scooby-doo";
        dog.move();

        Cat cat=new Cat();
        cat.move();

        dog.eat();
        Dolphin dolphin=new Dolphin();
        dolphin.makeNoise();
        dolphin.move();

        LeopardShark leopardShark=new LeopardShark();
        leopardShark.move();
        leopardShark.name="Leo";
        leopardShark.eat();

        //                         Animal(abstract)
        //                 Fish(Abstract)    Cat     Dog
        //       Dolphin   Shark
        //                 LeopardShark



    }
}
