package day40;

public class Encapsulation {

    private int number;
    double doubleNumber;
    private String str;

    public Encapsulation(int num) {
        this.number = num;
        //    number         10
    }

    public void print() {
        System.out.println(number);
    }

    public int getNumber() {
        return number;
    }

    public String getStr() {
        return str;
    }

}
