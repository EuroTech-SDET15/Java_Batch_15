package day15;

public class NestedLoop_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int n = 0; n < 4; n++) {// 0 1

                if (n == 2) {
                    break;
                }
                System.out.print(i + " ");
            }
            System.out.println();
        }


        System.out.println("==================");

        for (int i = 1; i <= 5; i++) {

            for (int n = 0; n < 4; n++) {
                System.out.print(i + " ");
            }
            if (i == 2) {
                break;
            }
            System.out.println();
        }
        // 1 1 1 1
        // 2 2 2 2


        System.out.println("==================");

        for (int i = 1; i <= 5; i++) {

            for (int n = 0; n < 4; n++) {
                if (n == 2) {
                    continue;
                }
                System.out.print(n + " ");
//  0 1 3
            }
            System.out.println();
        }


    }
}
