package day4;

public class String_ {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        String city;
//        System.out.println(city);Variable 'city' might not have been initialized
        city = "Oslo";
        String name = "Messi";
        String country = "Spain";
        System.out.println("city = " + city);
        System.out.println("name = " + name);
        System.out.println("country = " + country);
        name = "Ronaldo";
        System.out.println("name = " + name);

        String number = "      123    ";
        int var = 123;
        System.out.println("number = " + number);
        number = "123";
        System.out.println(123 + 123);//246
        //                  int   int--->int
        System.out.println(number + 123);
        //                  string   int ---> string
        System.out.println(number + var);
        System.out.println("123" + 123);//concat
        //                  string  int--->string
        System.out.println("Hello " + 123);
        //                   string int  ___>string
        System.out.println(123 + " Hello");
        //                 int     string ---> string


        //create 2 variables
        // first string name
        // int age
        // Ali is 20 years old


        String var2 = "Hello ";
        String var3 = " World";
        System.out.println(var2 + var3 + ".");
        String var4 = var2 + var3;//Hello World
        System.out.println("var4 = " + var4);


    }
}
