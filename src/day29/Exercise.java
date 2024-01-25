package day29;

import java.util.Locale;

public class Exercise {
    public static void main(String[] args) {
        String shoppingList = "2 Bread,2 kg orange, 1 fruit juice";
        //                     01234567                     90123
        //how many char in the string?
        System.out.println("shoppingList.length() = " + shoppingList.length());
        //get the first letter
        System.out.println("shoppingList.charAt(0) = " + shoppingList.charAt(0));
        System.out.println("shoppingList.substring(0,1) = " + shoppingList.substring(0, 1));
        //print last letter
        //apple length 5
        //01234
        //charAt
        System.out.println("shoppingList.charAt(4) = " + shoppingList.charAt(33));
        System.out.println("shoppingList.charAt(4) = " + shoppingList.charAt(shoppingList.length() - 1));
        //substring
        System.out.println("shoppingList.substring(33) = " + shoppingList.substring(33));
        System.out.println("shoppingList.substring(shoppingList.length()-1) = " + shoppingList.substring(shoppingList.length() - 1));
        //last 5 letters  substring
        System.out.println("shoppingList.substring(29,34) = " + shoppingList.substring(29, 34));
        System.out.println("shoppingList.substring(29) = " + shoppingList.substring(29));
        System.out.println(shoppingList.substring(shoppingList.length() - 5));
        //check there is mango or not
        System.out.println("shoppingList.contains(\"mango\") = " + shoppingList.contains("mango"));
        String fruit = "Orange";
        System.out.println("shoppingList.contains(fruit.toLowerCase()) = " + shoppingList.contains(fruit.toLowerCase()));
        //3-9 equals Bread or not
        System.out.println("shoppingList.substring(3,9).equals(\"Bread\") = " + shoppingList.substring(3, 9).equals("Bread"));
//      2-7 equals bread  -->true
        System.out.println("shoppingList.substring(2,7) = " + shoppingList.substring(2, 7).equals("bread"));
        System.out.println("shoppingList.substring(2, 7).equalsIgnoreCase(\"bread\") = " + shoppingList.substring(2, 7).equalsIgnoreCase("bread"));

        //Bread or not  the first 5 letters Bread or not
        //012345
        System.out.println("shoppingList.substring(0,5).equals(\"Bread\") = " + shoppingList.substring(0, 5).equals("Bread"));
        System.out.println("shoppingList.startsWith(\"bread\") = " + shoppingList.startsWith("bread"));
        //check the last 5 letters equals juice
        System.out.println("shoppingList.endsWith(\"juice\") = " + shoppingList.endsWith("juice"));
        String drink = "Juice";
        shoppingList = "2 Bread,2 kg orange,5 fruit JuIcE";
        //true,
        System.out.println("shoppingList.substring(shoppingList.length()-5).equalsIgnoreCase(drink) = " + shoppingList.substring(shoppingList.length() - 5).equalsIgnoreCase(drink));
        System.out.println("shoppingList.toLowerCase().endsWith(drink.toLowerCase()) = " + shoppingList.toLowerCase().endsWith(drink.toLowerCase()));
        //get the number of fruit juice

        System.out.println(shoppingList.charAt(shoppingList.length() - 13));
        System.out.println("shoppingList.indexOf(\",\") = " + shoppingList.indexOf(","));
        System.out.println("shoppingList.lastIndexOf(\",\") = " + shoppingList.lastIndexOf(","));
        int indexOfSecond = shoppingList.lastIndexOf(",");
        System.out.println("i = " + indexOfSecond);
        int indexOfFruitJuice = indexOfSecond + 1;
        System.out.println(shoppingList.charAt(indexOfFruitJuice));
        System.out.println(shoppingList.lastIndexOf(",") + 1);//,1
        shoppingList = "2 Bread,2 kg orange,5 fruit JuIcE";
        //                                        2728
        System.out.println("shoppingList.lastIndexOf(' ') = " + shoppingList.lastIndexOf(' '));
        System.out.println("shoppingList.substring(28) = " + shoppingList.substring(28));
        System.out.println("shoppingList.substring(shoppingList.lastIndexOf(\" \")+1) = " + shoppingList.substring(shoppingList.lastIndexOf(" ") + 1));
        int lastSpace = shoppingList.lastIndexOf(" ");
        System.out.println("shoppingList.substring(lastSpace+1) = " + shoppingList.substring(lastSpace + 1));
        //concat
        System.out.println(shoppingList + ",1 bottle of Milk");
        System.out.println(shoppingList.concat(",1 bottle of Milk"));
        shoppingList = shoppingList.concat(",1 bottle of milk.");
        System.out.println("shoppingList = " + shoppingList);
        System.out.println(shoppingList.concat(",2 kg apple").concat(",1 newspaper."));
        shoppingList = "2 Bread,2 kg orange,5 fruit JuIcE";
        // orange-->apple
        System.out.println(shoppingList.replace("orange", "apple"));
        System.out.println(shoppingList);
        shoppingList = shoppingList.replace("orange", "apple");
        System.out.println("shoppingList = " + shoppingList);
        shoppingList = "2 Bread,2 kg orange,2 kg orange,5 fruit JuIcE";
        System.out.println(shoppingList.replace("orange", "apple"));
        System.out.println(shoppingList.replaceFirst("orange", "apple"));
        System.out.println(shoppingList.replaceAll("orange", "apple"));
        System.out.println(shoppingList);
        System.out.println(shoppingList.replace('o', 'O'));
        //trim() Returns a string whose value is this string, with all leading and trailing space removed,
        shoppingList = "   2 Bread,2 kg orange,2 kg orange,5 fruit JuIcE  ";
        System.out.println(shoppingList);
        System.out.println(shoppingList.trim());

        //compareTo
        String str = "def";
        System.out.println(str.compareTo("abc"));
        System.out.println("n".compareTo("z"));
        System.out.println('z'-'n');


    }
}
