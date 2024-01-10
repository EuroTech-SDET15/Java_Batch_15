package day18;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");//0 1 2 4
        }
        System.out.println("==============");
        for (int i = 0; i < 5; i++) {
            if (i == 3 || i == 1) {
                continue;
            }
            System.out.print(i + " ");//0 2 4
        }

        System.out.println("=============");
        int count = 10;
        while (true) {
            System.out.println(count);
            count--;
            if (count == 0) {
                break;
            }
        }

        System.out.println("================");
        int number = 0;
        while (number < 5) {
            number++;
            if (number == 2) {
                continue;
            }
            System.out.println(number);//1345
        }


    }

}
