package day20;

public class VariableParam {

    public static void main(String[] args) {
        String text= "1";
        short key = 1;
        int number = 1;
        double rate = 1.5;

        printValue((int)rate);
//        printValue(text);
    }

    public static void printValue(int value){
        System.out.println("value = " + value);
    }
}
