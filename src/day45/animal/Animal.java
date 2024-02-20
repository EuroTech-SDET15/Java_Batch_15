package day45.animal;

public class Animal {

    Animal(String firstName, String kind) {
        this.name = firstName;
        species = kind;
        System.out.println("Animal object created and name of it : " + this.name);
    }

    String name;

    String species;

    int age;

    String color;

    boolean isCarnivor;//eating meet or not

    boolean isHungry;


    public void eat() {
//        System.out.println("Animal is eating");
        System.out.println(name + " is eating");
        System.out.println(this.name + " is eating");
        this.isHungry = false;
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void move() {
        System.out.println(name + " is moving.");
    }

    public void makeSound() {
        System.out.println(name + " makes sound!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isCarnivor=" + isCarnivor +
                ", isHungry=" + isHungry +
                '}';
    }
}
