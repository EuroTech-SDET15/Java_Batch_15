package day40;

public class Builder {
    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(str.replace("Hello", "Hi"));//Hi
        System.out.println("str = " + str);// Hello   immutable
        System.out.println("str.toUpperCase() = " + str.toUpperCase());//HELLO
        System.out.println("str = " + str);//Hello
        System.out.println("str.concat(\"Marry\") = " + str.concat("Marry"));
        System.out.println("str line 12 " + str);//Hello


        StringBuilder builder = new StringBuilder("Hello");//mutable
        System.out.println("builder.replace(0, 5, \"Hi\") = " + builder.replace(0, 5, "Hi"));
        System.out.println("builder = " + builder);
        builder.append(" Marry");
        System.out.println("builder = " + builder);//Hi Marry
        //                                           01234567
        builder.replace(3, 8, "Linda");
        builder.reverse();
        System.out.println("builder = " + builder);

        //String -->StringBuilder
        //StringBuilder -->String
        str = "Hello";
        StringBuilder builder1 = new StringBuilder(str);
        System.out.println("builder1 = " + builder1);

        builder1 = new StringBuilder("Hi");
        String var = builder1.toString();
        System.out.println("var = " + var);

        str = "Hello";
        System.out.println(reverseString(str));
        String reversed = reverseString("Ali");
        System.out.println("reversed = " + reversed);//ilA

    }

    public static String reverseString(String var) {
        StringBuilder builder = new StringBuilder(var);
        var = builder.reverse().toString();
        return var;
    }
}
