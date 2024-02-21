package day46.override;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();//parent class
        child.greet();//from child class
        Parent parent = new Parent();
        parent.greet();
        // child.privateMethod();private method not accesible out of the class so not inherited

        child.number = 4;

       // child.value=50; value is private so not accesible
    }
}
