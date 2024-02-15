package day43;

public class StaticMethod2 {

    int number;
    static int count=100;


    public StaticMethod2(int number) {
        this.number = number;
        System.out.println(count);
    }

    public void printNumber(){
        System.out.println("number = " + this.number);
        System.out.println(count);
    }

    public static void generateRandomNumber(){
     //   System.out.println(this.number);
        System.out.println("Math.random() = " + Math.random());
        System.out.println(count);
    }
}
