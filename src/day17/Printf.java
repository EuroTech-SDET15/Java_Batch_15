package day17;

public class Printf {
    public static void main(String[] args) {
        int number = 8;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
        System.out.println("==================");
        for (int i = 1; i <= 10; i++) {
//                              8 * 1 = 8
            System.out.printf("%-2d * %-2d = %2d\n", number, i, number * i);


        }
        int age = 40;
        System.out.println("I m " + age + " years old.");
        System.out.printf("I m %d years old.", age);
        String name = "Ali";
        System.out.println();
        System.out.println("His name is "+name);
        System.out.printf("His name is %s",name);

        //multiplication table
        //1      to      10
        // nested loop
// 1 * 1 = 1      9 * 10 = 90
// 1 * 2 = 2


    }
}
