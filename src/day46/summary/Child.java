package day46.summary;

public class Child extends Parent {
    String city;

    Child(String name){
        super(name);
    }

    public void childMethod() {
        System.out.println("this.city = " + this.city);
        System.out.println("super.number from child class " + super.number);
    }
    public void lastMethod(int x){
        System.out.println("Child");
    }
}
