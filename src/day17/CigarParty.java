package day17;

public class CigarParty {

//    When squirrels get together for a party, they like to have cigars.
//    A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
//    Unless it is the weekend, in which case there is no upper bound on the number of cigars.
//    Return true if the party with the given values is successful, or false otherwise.
//
//    cigarParty(30, false) → false
//    cigarParty(50, false) → true
//    cigarParty(70, true) → true

    //if the cigars between 40-60(inclusive) print true, but if it is not weekend
    // if it is weekend there is no upperbound (60 is not important)
    //if party is succesfull print tru else print false
    public static void main(String[] args) {
        int cigars = 70;
        boolean isWeekend = true;  //   print

        if (isWeekend) {
            if (cigars >= 40) {
                System.out.println("Succesfull!!!!");
            } else {
                System.out.println("unseccesfulll!!!");
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                System.out.println("Succesfull!!!!");
            } else {
                System.out.println("unsuccesfulll!!!");
            }
        }


        System.out.println("============================================");
        String result = "Unsuccesful!!!!";

        if (isWeekend) {
            if (cigars >= 40) {
//                System.out.println("Succesfull!!!!");
                result = "Succesfull!!!!";
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                result = "Succesfull!!!!";
            }
        }

        System.out.println("result = " + result);


        System.out.println("============================================");
        result = "Unsuccesful!!!!";

        if (isWeekend && cigars >= 40) {
            result = "Succesfull!!!!";
        } else if (!isWeekend && cigars >= 40 && cigars <= 60) {
            result = "Succesfull!!!!";
        }

        System.out.println("result = " + result);

        System.out.println("=====================");

        result = (isWeekend && cigars >= 40) ? "Succesfull!!!!" :
                (!isWeekend && cigars >= 40 && cigars <= 60) ?
                        "Succesfull!!!!" : "Unsuccesfull!!!";

        System.out.println("=============================");


    }
}
