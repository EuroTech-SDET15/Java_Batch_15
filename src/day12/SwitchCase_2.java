package day12;

public class SwitchCase_2 {
    public static void main(String[] args) {
        String day = "Sunday";

        //Tuesday is the second day of the week

        switch (day) {
            case "Monday":
                System.out.println("it is the first day of the week!!!");
                break;
            case "Tuesday":
                System.out.println("Second day of the week");
                break;
            case "Wednesday":
                System.out.println("middle of the week!!!");
                break;
            case "Thursday":
                System.out.println("almost weekend!!!be patient");
                break;
            case "Friday":
                System.out.println("end of the week days");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Happy weekend");
                break;
//            case "Friday":  Duplicate label 'Friday'
//                System.out.println("end of the week days");
//                break;
            default:
                System.out.println("Invalid day!!!!");
        }


    }
}
