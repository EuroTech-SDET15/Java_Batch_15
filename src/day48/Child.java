package day48;

public class Child extends FinalParent{

    //parent variable hiding
    int number=22;

    // parent method hiding
    public static void sleepingHours(){
//        super.sleepingHours();
        System.out.println("1am - 1pm");
    }


    public static void main(String[] args) {
        Child child1 = new Child();
        System.out.println("child1.number = " + child1.number);
        child1.setNumber(111);
        child1.getNumber();

        child1.sleepingHours();

    }

    @Override
    public void setNumber(int number) {
        System.out.println("number = " + number); //local
        System.out.println("this.number = " + this.number);
        System.out.println("super.number = " + super.number);
        super.setNumber(number*2);
    }

//    @Override
//    public void getNumber() {
//        System.out.println("Override Getnumber!!");
//        super.getNumber();
//    }


}

