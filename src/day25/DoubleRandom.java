package day25;

import java.util.Random;

public class DoubleRandom {

    public static void main(String[] args) {

        Random random =new Random();

        double randomDouble= random.nextDouble(); // [0.0 - 1.0)

        System.out.println("randomDouble 1 = " + randomDouble);

        randomDouble= random.nextDouble();
        System.out.println("randomDouble 2 = " + randomDouble);

        randomDouble= random.nextDouble();
        System.out.println("randomDouble 3 = " + randomDouble);

        // Let's create a random salary increase rate! [10.0  - 20.0)
//        [10 - 20)  + [0.0 - 1.0)  -->  [10.0  - 20.0)
//                                      10    19          0.0      0.999
        double rate= random.nextInt(10,20) + random.nextDouble();
        System.out.println("\nSalary rate = " + rate);

//        random.nextDouble() * 10 + 10
//        // 10.0     19.99  +
    }
}
