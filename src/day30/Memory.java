package day30;

public class Memory {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        String city = "Oslo";
        String capital = city;
        city = "London";
        System.out.println("city = " + city);
        System.out.println("capital = " + capital);


        String name = "David";
        String firstName = new String("David");
        System.out.println(name == firstName);
        String secondName = "David";
        System.out.println(name == secondName);
        a = 30;

        printNumber(a);//lifo
        System.out.println("a is in the main method " + a);
        boolean isWeekend = false;
        System.out.println(name == secondName);
        name = "Messi";
        String wholeName = new String("David");
        wholeName = name;
        name = null;

    }

    static void printNumber(int a) {
        System.out.println("a in the print method " + a);
        a = 50;
        System.out.println(a);

    }
}
