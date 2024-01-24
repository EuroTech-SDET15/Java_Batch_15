package day28;

public class ExtraEnd {
//    Given a string, return a new string made of
//    3 copies of the last 2 chars of the original string.
//    The string length will be at least 2.
//

    //    extraEnd("Hello") → "lololo"
//    extraEnd("ab") → "ababab"
//    extraEnd("Hi") → "HiHiHi"
    public static void main(String[] args) {

        System.out.println("extraEnd(\"ab\") = " + extraEnd("ab"));
        System.out.println("extraEnd(\"Hi\") = " + extraEnd("Hi"));
        System.out.println("extraEnd(\"Hello\") = " + extraEnd("Hello"));
    }

    public static String extraEnd(String str) {
        //Hello
        //01234
        String last2 = str.substring(str.length() - 2);
        //  return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);

        return last2 + last2 + last2;
    }


}
