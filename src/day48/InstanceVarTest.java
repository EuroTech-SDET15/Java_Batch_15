package day48;

public class InstanceVarTest {

    int number;

    public static void main(String[] args) {
        System.out.println("Phase1");
        InstanceVarTest obj1 = new InstanceVarTest();
        obj1.number=11;

        System.out.println("Phase2");
        System.out.println("Phase3");
        System.out.println("Phase4");

        InstanceVarTest obj2 = new InstanceVarTest();
        obj2.number = 12;

        InstanceVarTest obj3 = new InstanceVarTest();
        obj3.number = 12;

        obj1 = obj2;


    }
}
