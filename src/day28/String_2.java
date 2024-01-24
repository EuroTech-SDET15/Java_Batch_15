package day28;

public class String_2 {
    public static void main(String[] args) {
        String str = "Studying Java";
//                    01234567890123
        //ing
        System.out.println("ing");
        System.out.println("str.substring(5,8) = " + str.substring(5, 8));
        System.out.println("str.substring(9,13) = " + str.substring(9, 13));
        System.out.println("str.substring(9) = " + str.substring(9));
        str = "Hello Marry and Hello Messi";
        //     01234567890123456789
        System.out.println("str.substring(16) = " + str.substring(16));
//        Hello Marry
        System.out.println("str.substring(0,11) = " + str.substring(0, 11));

        String city = "London";

        //to check the values are same or not
        System.out.println("city.equals(\"London\") = " + city.equals("London"));
        String capital = "Ankara";
        System.out.println("city.equals(capital) = " + city.equals(capital));
        String city5 = new String("London");
        System.out.println("city5.equals(city) = " + city5.equals(city));
        String city10 = "london";
        System.out.println("city10.equals(city) = " + city10.equals(city));
// == checking the address of the object

        str = "Hello Messi";
//             0123456
        //substring ===> Messi
        String name = "Messi";
        System.out.println("str.substring(6) = " + str.substring(6));
        String player = str.substring(6);
        boolean isNameSame = player.equals(name);
        System.out.println("isNameSame = " + isNameSame);
        System.out.println("player.equals(name) = " + player.equals(name));
        System.out.println("str.substring(6).equals(name) = " + str.substring(6).equals(name));
        str.substring(6);//Messi
        System.out.println("str.substring(6).length() = " + str.substring(6).length());
        str = "Hello Messi";
        //      0123456
        System.out.println("str.substring(6) = " + str.substring(6));
        System.out.println("str.length() = " + str.length());
        System.out.println("str.substring( str.length()-5    ) = " + str.substring(str.length() - 5));
    }
}
