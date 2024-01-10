package day18;

public class Speeding {

//    You are driving a little too fast, and a police officer stops you.
//    Write code to compute the result, encoded as an int value: 0=no ticket,
//    1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
//    If speed is between 61 and 80 inclusive, the result is 1.
//    If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day,
//    your speed can be 5 higher in all cases.
//

    //    caughtSpeeding(60, false) → 0 no ticket
//    caughtSpeeding(65, false) → 1 small ticket
//    caughtSpeeding(65, true) → 0 no ticket
    public static void main(String[] args) {
        int speed = 81;
        boolean isBirthday = false;
//first solution
        if (isBirthday) {
            if (speed < 66) {
                System.out.println("No ticket!!!");
            } else if (speed < 86) {
                System.out.println("Small ticket!!!");
            } else {
                System.out.println("Big ticket");
            }
        } else {// if it is not birthday
            if (speed < 61) {
                System.out.println("No ticket!!!");
            } else if (speed < 81) {
                System.out.println("Small ticket!!!");
            } else {
                System.out.println("Big ticket");
            }
        }

        System.out.println("========================================");
        String ticketType;
        if (isBirthday) {
            if (speed < 66) {
                ticketType = "No ticket!!!";
            } else if (speed < 86) {
                ticketType = "Small ticket!!!";
            } else {
                ticketType = "Big ticket";
            }
        } else {// if it is not birthday
            if (speed < 61) {
                ticketType = "No ticket!!!";
            } else if (speed < 81) {
                ticketType = "Small ticket!!!";
            } else {
                ticketType = "Big ticket";
            }
        }
        System.out.println("ticketType = " + ticketType);



    }
}
