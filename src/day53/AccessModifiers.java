package day53;

public class AccessModifiers {

    //public private protected default

    private int number;
    protected String city;

   protected AccessModifiers() {

    }

   private void print() {
        System.out.println("Access modifier class");
       System.out.println("number = " + number);
   }

   protected void read(){
       System.out.println("Read java book!!!!!");
   }


}
