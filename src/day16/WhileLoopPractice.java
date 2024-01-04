package day16;

public class WhileLoopPractice {

    public static void main(String[] args) {

        // I want to count back from 10 for new year celebration

        for (int i=10 ;i>0 ; i--){

            System.out.println("Count "+ i);

        }
        System.out.println("Happy New Year!!!");

        ///////////////////////////
        System.out.println("//////////WHILE LOOP/////////////////");
        int i = 10;
        while(i>0){
            System.out.println("Count "+ i);
            i--;
        }


        System.out.println("//////////infinitive LOOP/////////////////");

        boolean flag = true;
        System.out.println("Start LOOP");
        while (flag){
            System.out.println("inside LOOP");
        }
        // if flag is false
        System.out.println("End of LOOP");



    }
}
