package day30;

public class Cleaning {
    String name;

    protected void finalize() throws Throwable {

        System.out.println("Garbage Collector is working!!!");

        super.finalize();
    }

    public static void main(String[] args) {

        Cleaning cleaner = new Cleaning();
        cleaner.name = "Messi";
        cleaner = null;
        System.gc();//Runs the garbage collector in the Java Virtual Machine

    }


}
