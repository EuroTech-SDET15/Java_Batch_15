package day30;

public class String_1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        String str = "Hello";
        String country = new String("Spain");

        String shoppingList = "2 kg apple,2 kg apple,1 bottle milk.";
        //                     012345678901234567
        //                                     orange
        //2 kg apple,2 kg        ,1 bottle milk.
        //                apple
        System.out.println(shoppingList.lastIndexOf("apple"));
        int index = shoppingList.lastIndexOf("apple");
        System.out.println("shoppingList.substring(0,index) = " + shoppingList.substring(0, index));
        System.out.println("shoppingList.substring(index) = " + shoppingList.substring(index));
        String first = shoppingList.substring(0, index);
        String second = shoppingList.substring(index);
        shoppingList = first.concat(second.replace("apple", "orange"));
        System.out.println("shoppingList = " + shoppingList);

        str = "Hello Ali Hello Ali";

    }

    public static void replaceSecond() {

    }
}
