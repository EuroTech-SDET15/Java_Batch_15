package day11;

public class MultiWayIfElse {
    public static void main(String[] args) {
        int number= 11;
        if(number>0){
            System.out.println("Number is POSITIVE");
        }

        if(number<0){
            System.out.println("Number is NEGATIVE");
        }

        if(number==0){
            System.out.println("Number is ZERO");
        }
        //////////////////////
        if (number>0) {
            System.out.println("Number is POSITIVE");
        }else if(number<0){
            System.out.println("Number is NEGATIVE");
        }else{
            System.out.println("Number is ZERO");
        }
    }
}
