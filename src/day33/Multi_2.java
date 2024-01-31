package day33;

public class Multi_2 {
    public static void main(String[] args) {
        //first week     Monday    Friday
        //second week    Tuesday   Wednesday
        //third week    Saturday  Sunday    Thursday

        String[][] workingDays = {
                {"Monday", "Friday"},
                {"Tuesday", "Wednesday"},
                {"Saturday", "Sunday", "Thursday"}
        };
        //first row length
        System.out.println(workingDays[0].length);
        //last row length
        System.out.println(workingDays[2].length);
        System.out.println(workingDays[0][0]);
        System.out.println(workingDays[0][1]);
        System.out.println(workingDays[1][0]);
        System.out.println(workingDays[1][1]);
        System.out.println(workingDays[2][0]);
        System.out.println(workingDays[2][1]);
        System.out.println(workingDays[2][2]);
        // type variable array
        //     variable
//        {"Monday", "Friday"},
//        {"Tuesday", "Wednesday"},
//        {"Saturday", "Sunday", "Thursday"}
        for (String day : workingDays[2]) {
            System.out.println("day = " + day);
        }
    }
}
