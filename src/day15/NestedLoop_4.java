package day15;

public class NestedLoop_4 {
    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****

        for (int i = 0; i < 4; i++) {
            for (int n = 0; n <= i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==============");
        //0
        //01
        //012
        //0123
        for (int i = 0; i < 4; i++) {
            for (int n = 0; n <= i; n++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //0
        //11
        //222
        //3333

        //     *
        //    **
        //   ***
        //  ****


        // ****
        // ***
        // **
        // *

        for (int i = 0; i < 4; i++) {
            for (int n = i; n < 4; n++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //   *
        //  ***
        // *****
        //*******


        //   *
        //  ***
        // *****
        //*******
        // *****
        //  ***
        //   *


    }
}
