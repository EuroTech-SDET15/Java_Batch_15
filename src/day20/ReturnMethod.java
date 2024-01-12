package day20;

public class ReturnMethod {

    public static void main(String[] args) {

      int resultValue =   multiply(5,2);

        String result= "These numbers sum is " + ( multiply(5,2));
        System.out.println("result = " + result);


        areTheseNumberEqual(1,1.0);

    }

    public static int multiply(int num1, int num2){
        int result= num1 + num2;
       // System.out.println("num1 + num2= " + result);
        return result;
    }


    public static boolean areTheseNumberEqual(int num1, double num2){

       return  (num1 == num2);

    }
}
