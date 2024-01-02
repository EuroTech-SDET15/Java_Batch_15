package day14;

public class ForLoops_2 {
    public static void main(String[] args) {
        int i = 0;
        {
            System.out.println(i);
        }
        i++;
        {
            System.out.println(i);
        }
        i++;
        {
            System.out.println(i);
        }

//        for (int n = 0; ; n++) {  will not be terminated
//            System.out.println(n);
//        }


//        for (int n = 0; n < 3; ) { will not stop
//            System.out.println(n);
//        }
//        for (int n = 0; n >= 0; n++) { will not be terminated
//            System.out.println(n);
//        }

        //  3 2 1

        for (int n = 3; n > 0; n--) {
            System.out.println("Reverse");
            System.out.println(n);
        }
        //  System.out.println(n); not accesible out of the for block

        // 1     10 include
        // 1
        // 2
        // 3
        // 4
        // 5
        int n = 1;
        for (; n <= 10; ++n) {
            System.out.println(n);
        }
        System.out.println("=================");
        for (double d = 0.1; d <= 1; d = d + 0.1) {
            System.out.println("d = " + d);
        }
        //0.1
        //0.2
        //0.3
        //0.4
        //0.5
        //0.6
        //0.7
        //0.8
        //0.9
        //1


        // char print alphabet
        int valA = 'A';
        System.out.println("valA = " + valA);
        int valB = 'B';
        System.out.println("valB = " + valB);

        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
        }

        System.out.println("=============");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }
        System.out.println("==============");
        for (char c = 65; c <= 'Z'; c++) {
            System.out.println(c);
        }
        System.out.println("=================");
        for (char c = 0; c <= 'z'; c++) {
            System.out.println(c);
        }


    }
}
