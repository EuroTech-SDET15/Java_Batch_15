package day48;

public class LocalVarTest {

    int idNumber;


    public static void main(String[] args) {
        LocalVarTest obj1 = new LocalVarTest();
        obj1.test();
        obj1.test();
    }

    public void test(){
        System.out.println("TEST METHOD CALLED!");
        int number=11111;

        System.out.println(number);
        System.out.println(idNumber);
    }
}
