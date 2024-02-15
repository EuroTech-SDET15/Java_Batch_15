package day43;

public class Blocks {

    int number = 100;
    static int count = 1;

    public Blocks(int num) {
        System.out.println("it is CONSTRUCTOR");
        this.number = num;
        count++;
    }

    { // INSTANCE BLOCK
      // (run after each obj declaration)
        System.out.println("it is INSTANCE block");
        number = 3000;
    }

    // STATIC BLOCK
    // (run only in the first call/ load just ONCE!!!)
    static {
        System.out.println("it is STATIC block");
    }

}
