package day45.animal;

public class Cat extends Animal {

    boolean hasClaws;

    Cat(String firstName, String kind) {
//        System.out.println();
        super(firstName, kind);// 'super()' must be first statement in constructor body
        System.out.println("Cat object created!");
        System.out.println("name of it  " + super.name);
        System.out.println(name);
    }


    public void climbing() {
//        System.out.println("Cat is climbing the tree.");
//        System.out.println(name + " is climbing the tree.");
        System.out.println(super.name + " is climbing the tree.");
    }

}
