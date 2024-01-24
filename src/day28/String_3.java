package day28;

public class String_3 {
    public static void main(String[] args) {
        String str = "Hello Ronaldo";
//        Returns true if and only if this string contains the specified sequence of char values
        //contains()
        System.out.println("str.contains(\"Ronaldo\") = " + str.contains("Ronaldo"));
        System.out.println("str.contains(\"Messi\") = " + str.contains("Messi"));
        String name = "Ali";
        System.out.println("str.contains(name) = " + str.contains(name));
        name = "Ronaldo";
        System.out.println("str.contains(name) = " + str.contains(name));
//        Returns the index within this string of the first occurrence of the specified substring.
        str = "Hi Messi Hi Hi";
        //     0123456789
        System.out.println("str.indexOf(\"Hi\") = " + str.indexOf("Hi"));
        System.out.println("str.indexOf(\"Messi\") = " + str.indexOf("Messi"));
        System.out.println("str.indexOf(\"Ali\") = " + str.indexOf("Ali"));
//Returns the index within this string of the last occurrence of the specified substring
        System.out.println("str.lastIndexOf(\"Hi\") = " + str.lastIndexOf("Hi"));

        System.out.println("str.indexOf('H') = " + str.indexOf('H'));
        System.out.println("str.indexOf('H') = " + str.indexOf('H', 3));
        System.out.println("str.indexOf(\"Hi\",5) = " + str.indexOf("Hi", 5));
        System.out.println("str.indexOf('M') = " + str.indexOf('M'));

        ////Hello Ali --> Ali is in the string or not --> if present true else false
        // check Ali is present in the string if it is find the index of Ali
        str = "Hello Ali";
        if (str.contains("Ali")) {
            System.out.println("str.indexOf(\"Ali\") = " + str.indexOf("Ali"));
        } else {
            System.out.println("Ali is not in the string!!!");
        }
    }
}
