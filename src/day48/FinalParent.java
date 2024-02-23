package day48;

public class FinalParent {

    int number=11;

    public static void sleepingHours(){
        System.out.println("10pm - 8am");
    }



    public void setNumber(int number){
        this.number=number;

    }

    final public void getNumber(){
        System.out.println
                ("number = " + number);
    }
}
