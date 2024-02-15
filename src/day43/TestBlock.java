package day43;

public class TestBlock {

    public static void main(String[] args) {
        System.out.println("OBJ - 1" );
        Blocks obj1 = new Blocks(200);

        System.out.println("\nOBJ - 2" );
        Blocks obj2 = new Blocks(400);
    }
}
/* run order

when we load the class (the first visit for first obj)
- run static field init - will run only in the first visit - once!
- static block run!! - just once!!
- instance field init
- instance block run!!
- constructor run

when re visit the class for 2. obj
- instance field init
- instance block run!!
- constructor run
 */