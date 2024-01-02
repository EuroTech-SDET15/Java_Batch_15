package day14;

public class ForLoops_3 {
    public static void main(String[] args) {
        int n = 0;
        for (; n < 5; n++) {
            System.out.println(n);//01234
        }
        System.out.println("n = " + n);

        for (n = 0; n < 3; n++) {
            System.out.println(n);//012
        }

        System.out.println("after second for loop , value of the n = " + n);


        //print
        //1
        //2
        //3
        //4
        //5

        //12345

        System.out.print("Hi ");
        System.out.println("Ali");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("after for");

        //find and print the even numbers between 1 and 40

        //2 4 6 8 10 12 14 16
        System.out.println("Even Numbers");
//        for (int i = 2; i <= 40; i = i + 2){
        for (int i = 2; i <= 40; i += 2) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i = 2; i <= 40; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }





    }
}
