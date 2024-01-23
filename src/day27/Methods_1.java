package day27;

import day2.HelloJava;

public class Methods_1 {
    public static void main(String[] args) {
        String name;
        name = new String("David ");
        //                        123456
        //length()  Returns the length of this string.number of characters
        System.out.println(name.length());
        int l = name.length();
        System.out.println("l = " + l);
        System.out.println("\" Hello \".length() = " + " Hello ".length());
        System.out.println("new String(\"Hi\").length() = " + new String("Hi").length());

        //charAt()--->Returns the char value at the specified index. An index ranges from 0 to length() - 1.
        // The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
        name = "Ali";
        //      012
        System.out.println(name.charAt(1));
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(2) = " + name.charAt(2));
//        System.out.println("name.charAt(3) = " + name.charAt(4));java.lang.StringIndexOutOfBoundsException
        //dynamic way to get the last letter of the string
        System.out.println("\"David\".charAt(4) = " + "David".charAt(4));
        System.out.println("\"David\".length() = " + "David".length());
        System.out.println("\"Ali\".charAt(2) = " + "Ali".charAt(2));
        System.out.println("\"Ali\".length() = " + "Ali".length());
        String str = "Hello";
        //          01234
        System.out.println("str.charAt(4) = " + str.charAt(4));
        System.out.println("str.charAt(str.length()-1) = " + str.charAt(str.length() - 1));
        System.out.println("returnLastLetter(\"Sarita\") = " + returnLastLetter("Sarita"));
        System.out.println("returnLastLetter(name) = " + returnLastLetter(name));
        char lastLetter = returnLastLetter("Oslo");

        //print all the letters Hello Ali
        str = "Hello Ali";
        //     012345678
        // H e l l o A l i
        str="Hello Marry";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(8));
        System.out.println("str.length() = " + str.length());
        for(int i=0;i<str.length();i++){
            System.out.println("str.charAt(i) = " + str.charAt(i));
        }

    }

    static char returnLastLetter(String str) {
        System.out.println("Last letter of the " + str + " = " + str.charAt(str.length() - 1));
        return str.charAt(str.length() - 1);
    }
}
