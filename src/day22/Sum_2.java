package day22;

public class Sum_2 {
    public static void main(String[] args) {
        //literal int value
        //byte short int long float double
        //the integer value without assigning a variable is as a default is int
        byte b = 4;
        sum(b);
        sum((byte) 4);
        //for narrowing we need to cast explicitly
        //  10 30 40 ----> as a default int
        // 30.56  ---> default double
        sum(4, 4);

    }

    static void sum(double s, double s1) {

    }

    static void sum(byte n) {
        System.out.println("n = " + n);
    }

}
