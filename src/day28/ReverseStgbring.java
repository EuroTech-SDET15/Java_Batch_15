package day28;

public class ReverseStgbring {
    public static void main(String[] args) {
        String str = "Hello Ali";
        //            01234

        // 4 3 2 1 0===> index numbers
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println("str.charAt(i) = " + str.charAt(i));
            reversed = reversed + str.charAt(i);
        }
        System.out.println("reversed = " + reversed);
        String reversed2 = "";
        //Hello
        for (int i = 0; i < str.length(); i++) {
            //             e                 H
            reversed2 = str.charAt(i) + reversed2;
        }
        System.out.println("reversed2 = " + reversed2);
        reverseString("Faruk");
        //             01234
        //  length  is 5
        String reversedAli = reverseString("Ali");
        System.out.println("reversedAli = " + reversedAli);
        String reversedLinda = reverseString("Linda");
        System.out.println("reversedLinda = " + reversedLinda);
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            //   System.out.println("str.charAt(i) = " + str.charAt(i));
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }


}
