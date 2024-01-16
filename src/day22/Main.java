package day22;

public class Main {
    public static void main(String[] a) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        int n = 10;
        System.out.println("real main method " + n);
        main(10);
        main(55.88);
    }

    public static void main(int args) {
        System.out.println("overloading main method, number 1 ");
    }

    public static void main(String[] args, int a) {
        System.out.println("overloading main method, number 2");
        System.out.println("a = " + a);
    }

    public static void main(double args) {
        System.out.println("overloading main method, number 3 ");
    }
}
