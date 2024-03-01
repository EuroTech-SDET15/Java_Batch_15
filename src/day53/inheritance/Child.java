package day53.inheritance;

public class Child extends Parent {

    Child(String name,int number){
        //if i want to acces parent class constructor and properties i need to use super keyword
        super(name,number);
    }

    @Override
    public String toString() {
        return "Child{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
