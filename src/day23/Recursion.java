package day23;

public class Recursion {
    public static void main(String[] args) {

        print(3);

    }

    public static void print(int num) {
        print1(num-1);
//        System.out.println("method number 1");
        System.out.println(num);
    }

    public static void print1(int num) {
        print2(num-1);
//        System.out.println("method number 2");
        System.out.println(num);
    }

    public static void print2(int num) {

//        System.out.println("method number 3");
        System.out.println(num);
    }
}
