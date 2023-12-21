package day12;

public class SwitchCase_3 {
    public static void main(String[] args) {
        String day = "Monday";

        switch (day) {
            case "Monday":
                switch ("Monday") {
                    case "Monday":
                        System.out.println("firstday");
                }
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Happy weekend!!!");
        }

    }
}
