package day14;

public class Scope {
    public static void main(String[] args) {

        int number = 10;
        System.out.println("number = " + number);

        {
            int num = 10;
            System.out.println("Block");
            System.out.println("num = " + num);
            System.out.println("number = " + number);
        }

//        num.soutv not accesible out of the block/scope
        int a = 10;
        int b = 20;
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);

        String var = " Hello!!1";
        {
            System.out.println(var);
            int x = 30;
            {
                System.out.println(x);
            }

        }
        number = 20;
        int n=0;
        switch (number) {
            case 10:
                System.out.println("Number is ten!!!");
                break;
            case 15:
                 n = 50;
                System.out.println("n = " + n);
                System.out.println("max = " + max);
                break;
            case 20:
                System.out.println("number is twenty.");
        }

        System.out.println("n = " + n);

        int var2=50;


    }


}
