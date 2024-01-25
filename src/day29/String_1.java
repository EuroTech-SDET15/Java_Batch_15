package day29;

public class String_1 {
    public static void main(String[] args) {
        String str = "Hello Java";
        str.length();
        str.charAt(0);
        str.substring(2);
        str.substring(0, 2);
        str.equals("Hi");
        str.equalsIgnoreCase("HELLO JAVA");
        str.contains("Hello");
        str.startsWith("Hi");
        str.endsWith("Java");
        str.toLowerCase();
        str.toUpperCase();
        str.indexOf("Hi");
        str.indexOf('H');
        str.indexOf("Java", 3);
        str.concat("Hello");
        str.replace("Hello", "Hi");
        str.replace('J', 'j');
        str.replaceFirst("Hello", "Hi");
        str.trim();
        str.compareTo("abc");




    }
}
