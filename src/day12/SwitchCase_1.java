package day12;

public class SwitchCase_1 {
    public static void main(String[] args) {
        int dayNumber = 7;
        //  monday tuesday wednesday thursday friday saturday sunday
        //    1       2         3       4       5       6       7

        if (dayNumber == 1) {
            System.out.println("Today is monday.");
        } else if (dayNumber == 2) {
            System.out.println("Today is tuesday.");
        } else if (dayNumber == 3) {
            System.out.println("Today is wednesday.");
        } else if (dayNumber == 4) {
            System.out.println("Today is thursday.");
        } else if (dayNumber == 5) {
            System.out.println("Today is friday.");
        } else if (dayNumber == 6) {
            System.out.println("Today is saturday.");
        } else if (dayNumber == 7) {
            System.out.println("Today is sunday.");
        } else {
            System.out.println("Invalid day number.");
        }
        System.out.println("========================");
        int number = 5;
        dayNumber = 3;
        switch (dayNumber) {
            case 1:
                System.out.println("Today is monday.");
                break;
            case 2:
                System.out.println("Today is tuesday.");
                break;
            case 3:
                System.out.println("Today is wednesday.");
                break;
            case 4:
                System.out.println("Today is thursday.");
                break;
            case 5:
                System.out.println("Today is friday.");
                break;
            case 6:
                System.out.println("Today is saturday.");
                break;
            case 7:
                System.out.println("Today is sunday.");
                break;
            default:
                System.out.println("Invalid day number!!!!");
        }
        System.out.println("after switch!!!!");

//        we can only use short byte int long char String   enum, wrapper classes  cant use double and float
//        float var1 = 5.5f;
//        switch (var1) {
//            case 2.5:
//
//        }


    }

}