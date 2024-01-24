package day28;

public class String_4 {
    public static void main(String[] args) {
        //toUpperCase()
        //Converts all of the characters in this String to upper case
        String str = "Hello";
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str = " + str);
        String upperCase = str.toUpperCase();
        System.out.println("upperCase = " + upperCase);
        str = str.toUpperCase();
        System.out.println("str = " + str);
        //toLowerCase()
        //Converts all of the characters in this String to lower cas
        System.out.println("str.toLowerCase() = " + str.toLowerCase());
        //equalsIgnoreCase
        // Compares this String to another String, ignoring case considerations.
        String name = "RoNalDo";
        System.out.println("name.equalsIgnoreCase(\"ronaldo\") = " + name.equalsIgnoreCase("ronaldo"));

        System.out.println("name.equals(\"ronaldo\") = " + name.equals("ronaldo"));
        System.out.println("name.toLowerCase().equals(\"ronaldo\") = " + name.toLowerCase().equals("ronaldo"));


        str = "Hello";
//        startsWith()
//        Tests if this string starts with the specified prefix.

        System.out.println("str.startsWith(\"Hi\") = " + str.startsWith("Hi"));
        System.out.println("str.startsWith(\"He\") = " + str.startsWith("He"));
//        Tests if this string ends with the specified suffix.
//          endsWith()
        System.out.println("str.endsWith(\"lo\") = " + str.endsWith("lo"));


    }
}
