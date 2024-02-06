package day36;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
//        ArrayList<String> foods;  declration
//        foods = new ArrayList<>(); initilisation
        ArrayList<String> foods = new ArrayList<>();
//        ArrayList<int> numbers = new ArrayList();Type argument cannot be of primitive type
        ArrayList<Integer> numbers = new ArrayList<>();
        //Arraylist is mutable
        //Strings immutable
        foods.add("mushroom");//Appends the specified element to the end of this list.
        System.out.println(foods);
        foods.add("potato");
        foods.add("onion");
        System.out.println(foods);
        String toma = "tomato";
        foods.add(toma);
        System.out.println(foods);
        foods.add(1, "cauliflower");
        System.out.println(foods);
//        foods.add(7,"brocoli");IndexOutOfBoundsException:
        foods.add(3, "brocoli");
        System.out.println(foods);
//        [mushroom, cauliflower, potato, brocoli, onion, tomato]
        //     0            1       2       3       4       5
        System.out.println(foods.get(1));
        System.out.println(foods.get(0));
//        System.out.println(foods.get(10));IndexOutOfBoundsException: Index 10 out of bounds for length 6

        System.out.println(foods.size());//Returns: the number of elements in this list

        System.out.println(foods.get(5));
        System.out.println(foods.get(foods.size() - 1));

        System.out.println(foods.get(4));
        System.out.println(foods.get(foods.size() - 2));

        foods.set(1, "carrot");
        System.out.println(foods);
        foods.set(0, "cauliflower");
        System.out.println(foods);
        foods.add(1, "mushroom");
        System.out.println(foods);
        foods.set(1, "pepper");
        System.out.println(foods);
        foods.set(foods.size() - 1, "mushroom");
        //          7-1
        System.out.println(foods.size());
        System.out.println(foods);
//        [cauliflower, pepper, carrot, potato, brocoli, onion, mushroom]
        //     0
        //remove() Removes the first occurrence of the specified element from this list, if it is present.
        // If the list does not contain the element, it is unchanged.
        foods.remove(0);
        System.out.println(foods);
        foods.remove("Mushroom");
        foods.remove("mushroom");
        System.out.println(foods);
        String food = "onion";
        foods.remove(food);
        System.out.println(foods);

        //add   get  set remove
        String name = "Ali";
        System.out.println(name.toUpperCase());//ALI
        System.out.println(name);//Ali
        foods.add(0, "onion");
        foods.add(3, "onion");
        System.out.println(foods);
//        foods.remove("onion");
        foods.add("brocoli");
        foods.add("brocoli");
        foods.add("onion");
        foods.add("onion");
        System.out.println(foods);

        ArrayList<String> removals = new ArrayList<>();
        removals.add("onion");
        removals.add("brocoli");
        foods.removeAll(removals);
        System.out.println(foods);
//        [pepper, carrot, potato]
//            0        1       2

        foods.add(2, "onion");
        //[pepper, carrot, onion, potato]
        //  0        1       2      3
        System.out.println(foods);
        foods.set(3, "brocoli");
//        [pepper, carrot, onion, brocoli]
        System.out.println(foods);
//contains()  Returns true if this list contains the specified element
        System.out.println(foods.contains("onion"));
        System.out.println(foods.contains("potato"));

        System.out.println(foods.indexOf("onion"));
        System.out.println(foods.indexOf("potato"));
//clear()  Removes all of the elements from this list. The list will be empty after this call returns.
        //foods.clear();
        System.out.println(foods);

        ArrayList<String> cloned = (ArrayList<String>) foods.clone();
        System.out.println(cloned);
//        Compares the specified object with this list for equality.
//                Returns true if and only if the specified object is also a list,
//                both lists have the same size, and all corresponding pairs of elements
//        in the two lists are equal. (Two elements e1 and e2 are equal if Objects.equals(e1, e2).)
        System.out.println(foods.equals(cloned));

        ArrayList<String> vegs = new ArrayList<>();
        vegs.add("brocoli");
        vegs.add("carrot");
        vegs.add("onion");
        vegs.add("pepper");
        System.out.println("vegs = " + vegs);
        System.out.println("foods = " + foods);
        System.out.println(vegs.equals(foods));


    }
}
