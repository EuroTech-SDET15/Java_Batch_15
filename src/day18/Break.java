package day18;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
//            System.out.println(i);//0123
            if (i == 3) {
                break;//if i equals 3 stop iteration of the loop
            }
            System.out.println(i);//0123
        }

        System.out.println("==================");
        for (int i = 5; ; i++) {
            System.out.print(i);//56789
            if (i == 9) {
                break;
            }
        }
        System.out.println("\n===========");
        //987654
        for (int i = 9; ; i--) {
            System.out.print(i);
            if (i == 4) {
                break;
            }
        }
        System.out.println("=================");
        //12345
        //do-while
        int number = 0;
        do {
            ++number;
            System.out.print(number);//12345


        } while (number < 5);
        System.out.println("\nout of the do-while block");
        System.out.println("number = " + number);
        System.out.println("==================");

        number = 0;
        do {
            ++number;
            System.out.print(number + ",");//12345
            if (number == 5) {
                break;
            }

        } while (number < 15);
        System.out.println("\nout of the do-while block");
        System.out.println("number = " + number);
        System.out.println("================");
        number = 0;
        do {
            ++number;
            if (number < 15) {
                System.out.print(number + ",");
            } else {
                System.out.print(number+".");
            }

        } while (number < 15);
        System.out.println("\nout of the do-while block");
        System.out.println("number = " + number);
    }
}
