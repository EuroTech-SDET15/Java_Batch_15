package day51.vehicle;

public class DaysTest {
    public static void main(String[] args) {
        System.out.println(Days.WEDNESDAY);
        Days day = Days.THURSDAY;
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Happy weekdays!!!!!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Happy weekend!!");
        }
        day = Days.TUESDAY;

        Days.printDay(day);
        System.out.println(Days.FRIDAY.dayNumber);
        System.out.println(Days.WEDNESDAY.dayNumber);

//        int number = 10;
//        double val = 0.50;
//        long l=123456l;
//
//        switch (l){
//
//        }
    }
}
