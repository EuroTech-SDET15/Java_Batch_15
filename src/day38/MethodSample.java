package day38;

public class MethodSample {


    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        System.out.println("method 1");
        method2();

    }

    public static void method2(){
        System.out.println("method 2");
        method3();
    }

    public static void method3(){
        System.out.println("method 3");
    }

    public void method4(){
        System.out.println("method 4");
    }
}
