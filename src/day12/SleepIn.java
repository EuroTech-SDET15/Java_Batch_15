package day12;

public class SleepIn {
    //    The parameter weekday is true if it is a weekday, and the parameter vacation is true if
//    we are on vacation. We sleep in if it is not a weekday or we're on vacation.
//    Return true if we sleep in.
//    sleepIn(false, false) → true
//    sleepIn(true, false) → false
//    sleepIn(false, true) → true
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vacation = false;

        if (weekday == true) {
            System.out.println("monday,tuesday,wednesday,thursday,friday");
        } else {
            System.out.println("weekend");
        }

        if (weekday) {
            System.out.println("monday,tuesday,wednesday,thursday,friday");
        } else {
            System.out.println("weekend");
        }
        weekday = true;
        vacation = true;
        if (!weekday || vacation) {
            System.out.println("sleeping");
            System.out.println(true);
        } else {
            System.out.println("neither weekend nor vacation");
        }

    }
}
