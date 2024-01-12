package day20;

public class ParamMethod {

    public static void main(String[] args) {
        printName("Elvis Presley");
        printName("Johny Cash");
        printName("Hasna Hanim");
//        int number;
//        System.out.println("number = " + number);
        printNumber(10);
        printNumber(11);
        printNumber(12);

    }

    public static void printNumber (int number){
        System.out.println("number = " + number);
    }

    public static void printName(String name){
        System.out.println("Name is " + name);
    }

//    public static void printName(){
//        System.out.println("Name is Claire");
//    }
}
