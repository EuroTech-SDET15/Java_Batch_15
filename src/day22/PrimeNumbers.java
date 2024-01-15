package day22;

public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(250,300);

    }
//if number is prime return true else return false
    public static boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    //print prime numbers 2-100
    //print prime numbers 2-200
    //print prime numbers 150-200

    public static void printPrimeNumbers(int startingPoint,int endPoint) {
      //  for (int i = 2; i < 100; i++) {
        for (int i = startingPoint; i < endPoint; i++) {
               if(isPrimeNumber(i)){
                   System.out.println(i+" is prime number");
               }else{
                   System.out.println(i+" is not prime number.");
               }
        }
    }
}
