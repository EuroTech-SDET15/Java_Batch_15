package day16;

public class ConvertTask {

    public static void main(String[] args) {

        int m = 6 , l= 0;
        do{
            m*=2;
            System.out.println("m = " + m);
            l++;
        }while (l<=5);

        System.out.println("/////////  FOR ////////////");

         m =6;
         l=0;

         if(!(l <= 5)) {
             m = m * 2;
             System.out.println("m = " + m);
         }
        for( l=0;l<=5;l++){
            m=m*2;
            System.out.println("m = " + m);
        }
    }
}
