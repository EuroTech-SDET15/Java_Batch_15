package day53.inheritance;

public class Test {

    public static void main(String[] args) {

        //static block executed

        //instance block executed
        //constructor executed

        //instance block executed
        //constructor executed

        //instance block executed
        //constructor executed



        Parent parent = new Parent("Michael",10);
//        parent.number = 10;
//        parent.name = "Michael";
        System.out.println(parent.toString());

        Child child=new Child("Henry",5);
        child.print();
        System.out.println(child.toString());
        Parent.classMethod();
        Child.classMethod();

        Child child1=new Child("Marry",7);
    }
}
