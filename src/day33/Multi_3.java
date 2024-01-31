package day33;

import java.util.Arrays;

public class Multi_3 {
    public static void main(String[] args) {
        String[][] workingDays = {
                {"Monday", "Friday"},
                {"Tuesday", "Wednesday"},
                {"Saturday", "Sunday", "Thursday"}
        };
//outer loop will give row count
        for (int i = 0; i < workingDays.length; i++) {
            for (int n = 0; n < workingDays[i].length; n++) {////column number
//                workingDays[i][n]
//                workingDays[0][2]
                System.out.println(workingDays[i][n]);
            }
        }


        String[][] days = new String[3][];
        days[0] = new String[2];
        days[1] = new String[2];
        days[2] = new String[3];
        System.out.println(Arrays.deepToString(days));
        days[0][0] = "Monday";
        days[0][1] = "Friday";
        days[1][0] = "Tuesday";
        days[1][1] = "Wednesday";
        days[2][0] = "Saturday";
        days[2][1] = "Sunday";
        days[2][2] = "Thursday";
        System.out.println(Arrays.deepToString(days));

    }
}
