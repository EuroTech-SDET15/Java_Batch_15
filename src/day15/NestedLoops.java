package day15;

public class NestedLoops {
    public static void main(String[] args) {
        //  System.out.println("*");

        //****
        //****
        //****

//outer loop   ====>specify row count
        for (int n = 0; n < 3; n++) {

            //inner loop  ===> specify column count
            for (int i = 0; i <= 3; i++) {

                System.out.print("*");//************

            }//inner loop block ends
            System.out.println();

        }//outer loop block ends
        System.out.println();
        System.out.println("out of the for loop!!!");
    }
}
