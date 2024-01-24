package day28;

public class FirstHalf {
    //    Given a string of even length, return the first half.
//    So the string "WooHoo" yields "Woo".
//
//    firstHalf("WooHoo") → "Woo"
//    firstHalf("HelloThere") → "Hello"
//    firstHalf("abcdef") → "abc"
    public static void main(String[] args) {
        String str = "WooHoo";
        //            012345
        System.out.println("str.substring(0,3) = " + str.substring(0, 3));
        System.out.println("str.length() = " + str.length());
        System.out.println("str.substring(0,str.length()/2) = " + str.substring(0, str.length() / 2));
        //                                                                      0,    6/2
        //                                                        str.substring(0,     3)
        System.out.println("str.length()/2 = " + str.length() / 2);
    }
}
