package day39;

public class DoubleX {
//    Given a string, return true if the first
//    instance of "x" in the string is immediately followed by another "x".
//

//    doubleX("axxbb") → true
    //           a
    //          xx
//    doubleX("axaxax") → false

    //    doubleX("xxxxx") → true
    public static void main(String[] args) {
        System.out.println(doubleX("axaxax"));
    }

    static boolean doubleX(String str) {
//        axaxax
        //ax
        //xa

//        012345
//        axxbb
        //ax xx
//        bbbax
//        012345
        //xaxxx

        boolean xPresent = false;
        for (int i = 0; i < str.length()-1 ; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                xPresent = (true);
            } else if (str.charAt(i) == 'x') {
                return xPresent;
            }
        }
        return xPresent;
    }
}
