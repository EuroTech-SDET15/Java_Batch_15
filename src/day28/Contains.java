package day28;

public class Contains {
    public static void main(String[] args) {
        //"Hello Ali Hello Marry Hello"       ===> how many times  lo is
        //lo
        String str = "Hello";
        //            01234
        //            01 12 23 34
        // ==  for all primitive data types
        if (str.charAt(0) == 'l' && str.charAt(1) == 'o') {
            System.out.println("lo is in the string");
        }
        if (str.charAt(1) == 'l' && str.charAt(2) == 'o') {
            System.out.println("lo is in the string");
        }
        if (str.charAt(2) == 'l' && str.charAt(3) == 'o') {
            System.out.println("lo is in the string");
        }
        if (str.charAt(3) == 'l' && str.charAt(4) == 'o') {
            System.out.println("lo is in the string");
        }

        str = "Hello Hello Hello";
        //     01234
        //
       // System.out.println("str.charAt(5) = " + str.charAt(5));
        for (int i = 0; i < str.length()-"lo".length()-1; i++) {
            if (str.charAt(i) == 'l' && str.charAt(i + 1) == 'o') {
                //          4                        5
                System.out.println("lo is in the string");
            }
        }

    }
}
