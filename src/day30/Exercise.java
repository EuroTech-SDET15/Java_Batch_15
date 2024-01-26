package day30;

public class Exercise {
    public static void main(String[] args) {
        String str = "The weather is nice in roma";
        //            0123
        //length
        //first 3
        //last4
        //change nice  rainy
        //index of roma
        //last 4 equals roma or not
        //first letter
        System.out.println("str.length() = " + str.length());
        System.out.println("str.substring(0,3) = " + str.substring(0, 3));
        System.out.println("str.substring(str.length()-4) = " + str.substring(str.length() - 4));
        System.out.println("str.replace(\"nice\",\"rainy\") = " + str.replace("nice", "rainy"));
        System.out.println("str.indexOf(\"roma\") = " + str.indexOf("roma"));
        System.out.println("str.endsWith(\"roma\") = " + str.endsWith("roma"));
        System.out.println("str.charAt(0) = " + str.charAt(0));
        //Roma
        System.out.println(str);//The weather is nice in Roma
        str = str.replace("roma", "Roma");
        System.out.println("str = " + str);
        //Ankara    length is 6
        //012
        //print first half
        System.out.println("first half " + str.substring(0, str.length() / 2));
        //second half
        System.out.println("second half = " + str.substring(str.length() / 2));
        String find = "nice";
        // NICE
        //The weather is nice in Roma
        int index = str.indexOf(find);
        System.out.println(str.substring(index, index + 4));
        System.out.println(str.substring(index, index + find.length()));
        System.out.println(str.substring(index, index + find.length()).toUpperCase());

        ////The weather is nice in Roma
        String city = "roma";
        //the last 4 letter check and get true
        System.out.println("str.endsWith(city) = " + str.endsWith(city));//false
        System.out.println(str.substring(str.length() - 4).equalsIgnoreCase(city));
// if the last 6 letters  not equals London
//        print city
        if (!str.substring(str.length() - 6).equals("London")) {
            System.out.println(city);
        }


    }
}
