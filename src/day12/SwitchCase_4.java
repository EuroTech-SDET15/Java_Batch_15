package day12;

public class SwitchCase_4 {
    public static void main(String[] args) {
        int monthNumber = 1;
        //print month name
        String month = "";
        switch (monthNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
//            case 3:Duplicate label '3'
//                month = "March";
//                break;
            default:
                month = "couldnt be found";
        }
        System.out.println("Month is " + month);
        System.out.println("out of the switch block!!!!");

        //you can create multiple cases , there is no restrictions
        //case value and variable value type must be compatible,same
        //label values must be unique
        // byte short int long String char enum wrapper class
        // break and default is optional
        month = "August";
        String season = "";
        //scanner
        //input from user

        switch (month){
            // january february december ===> season=winter
            // march april may ===> spring
            // june july august ===> summer
            // september october november ===> autumn
            // default not found
            //print season




        }


    }
}
