package day16;

public class PointSample {

    public static void main(String[] args) {


        int num=0;

        while (num<4){
            System.out.println("\nITERATION -" + (num+1));
//Point -A
            System.out.println("Point -A ("+num+"<4) = " + (num < 4));
            System.out.println("num = " + num);
            num++;
//Point -B
            System.out.println("Point -B ("+num+"<4) = " + (num < 4));
        }
//Point -C
        System.out.println("\nPoint -C ("+num+"<4) = " + (num < 4));
    }
}
