package day20;

public class ParamMethodPractice {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("HELLO");
//        Thread.sleep(4000);

        System.out.println("B15");


        System.out.println("Login Page");
        // wait 3 sec
        pauseRun(3);

        System.out.println("Go to order page");
        // wait 30 sec
        pauseRun(30);
        System.out.println("CREATE ORDER");
        // 5 sec
        pauseRun(5);

        System.out.println("VERIFY ORDER");
        // 100 sec
        pauseRun(100);
    }

    public static void pauseRun(int second) throws InterruptedException {
        Thread.sleep(second * 1000);
    }


//    public static void pauseRun() throws InterruptedException {
//        Thread.sleep(60000);
//    }
//
//    public static void pauseRun5sec() throws InterruptedException {
//        Thread.sleep(5000);
//    }
//
//    public static void pauseRun30sec() throws InterruptedException {
//        Thread.sleep(30000);
//    }

}
