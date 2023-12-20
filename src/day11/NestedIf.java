package day11;

public class NestedIf {


    public static void main(String[] args) {
        // if a number is multiply of 2 say Hi even!
        // if a number is multiply of 10 say Hi tenten!
        int number = 11;
//        if(number %2 == 0){
//            System.out.println("Hi Even!!");
//        }
//        if(number %10 == 0){
//            System.out.println("Hi tenten!!");
//        }


        if (number % 2 == 0) { // cond1
            System.out.println("Hi Even!!");  //cond1 must be true

            if (number % 10 == 0) { // cond2
                System.out.println("Hi tenten!!"); // cond1 and cond2 must be true
            }
        }


    }

}
