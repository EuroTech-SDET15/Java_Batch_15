package day16;

public class doWhileLoop {

    public static void main(String[] args) {

        int number = -5;
// ctrl + / comment all
        while (number > 0) {
            System.out.println("number = " + number);
            number--;
        }
        System.out.println("///////////////////");
        number= -5;
        do{
            System.out.println("number = " + number);
            number--;
        }while(number>0);

    }
}
