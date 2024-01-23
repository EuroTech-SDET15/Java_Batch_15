package day27;

public class Methods_2 {
    public static void main(String[] args) {
        String str = "Hello Marry";
        //            01234567890

        //   Returns a string that is a substring of this string.
        //       The substring begins with the character at the specified index and extends to the end of this string
        System.out.println("str.substring(6) = " + str.substring(6));
        System.out.println("str.substring(0) = " + str.substring(0));
        str = "Istanbulls";// bulls
        //     0123456789

        System.out.println("str.substring(5) = " + str.substring(5));

        str = "Hello Marry";
        //     01234567890
//        Returns a string that is a substring of this string.
//            The substring begins at the specified beginIndex and extends to the character at index endIndex
        System.out.println("str.substring(0,5) = " + str.substring(0, 5));//until index 5
        String s = "smiles";
        //          012345
        System.out.println("s.substring(1) = " + s.substring(1));

//reverse a string--> create amethod
//Hello Ali --> Ali is in the string or not --> if present true else false
//"Hello Ali Hello Marry Hello"       ===> how many times  lo is

    }
}
