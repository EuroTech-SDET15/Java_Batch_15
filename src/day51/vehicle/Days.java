package day51.vehicle;

public enum Days {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
//     1      2         3          4        5        6         7

    int dayNumber;

    Days(int number) {
        dayNumber = number;
    }

    public static void printDay(Days day) {
        switch (day) {
            case MONDAY:
                //System.out.println("first day of the week");
                System.out.println(MONDAY + " is the " + MONDAY.dayNumber + ".day of the week.");
                break;
            case TUESDAY:
              //  System.out.println("second day of the week.");
                System.out.println(TUESDAY + " is the " + TUESDAY.dayNumber + ".day of the week.");
                break;
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:

                break;
            case SATURDAY:
                System.out.println(SATURDAY + " is the " + SATURDAY.dayNumber + ".day of the week.");
                break;
            case SUNDAY:
                System.out.println(SUNDAY + " is the " + SUNDAY.dayNumber + ".day of the week.");

        }


    }

}
