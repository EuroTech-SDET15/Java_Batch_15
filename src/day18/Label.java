package day18;

public class Label {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {// 0 1 2  ====> there are 3 rows
            inner:
            for (int n = 0; n < 5; n++) {// 01234===>5 column
                if (n == 3) {
                    break;
                }
                System.out.print(n);//
            }
            System.out.println();
        }
        //00000
        //11111
        //22222

//        01234
//        01234
//        01234

        System.out.println("=============");
        outer:
        for (int i = 0; i < 3; i++) {// 0 1 2  ====> there are 3 rows
            inner:
            for (int n = 0; n < 5; n++) {// 01234===>5 column
                System.out.print(n);//
            }
            System.out.println();
            if (i == 1) {
                break;
            }
        }
        //01234
        //01234
        System.out.println("=============");
        outer:
        for (int i = 0; i < 3; i++) {// 0 1 2  ====> there are 3 rows
            if (i == 1) {
                break;
            }
            inner:
            for (int n = 0; n < 5; n++) {// 01234===>5 column
                System.out.print(n);//
            }
            System.out.println();

        }
        System.out.println("out of the outer loop");
        //01234

        System.out.println("=============");
        System.out.println("label outer loop, break it from inner loop!!");
        outer:
        for (int i = 0; i < 3; i++) {// 0 1 2  ====> there are 3 rows

            inner:
            for (int n = 0; n < 5; n++) {// 01234===>5 column
                if (i == 1) {
                    break outer;
                }
                System.out.print(i);
            }
            System.out.println();

        }
        System.out.println("out of the outer loop");
//        00000

        first:
        for (int i = 0; i < 5; i++) {
//            if (i == 3) {
//                break first;
//            }
//            System.out.println(i);
            second:
            for (int n = 0; n < 3; n++) {
                if (n == 2) {
                    break;//it will affect inner loop , stop inner loop
                }
                if (i == 3) {
                    break first;//will stop outer loop
                }
                System.out.print(n);
            }
            System.out.println();

        }


    }
}
