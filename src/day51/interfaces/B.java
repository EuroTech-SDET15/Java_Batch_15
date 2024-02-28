package day51.interfaces;

public interface B {

//    B(){Not allowed in interface
//    }

    //cant create object
    //there is no instance methods(non static methods)
//all variable  public static final
//    public static final int number=10;
    int number = 10;
    String city = "London";
    String companyName = "Google";


    void write();//as a default method is abstract,public

    //Modifier 'abstract' is redundant for interface methods
    //Modifier 'public' is redundant for interface members
    int add(int number);

    static void read() {
        System.out.println("static method in interface.");
    }


}
