package day36;

import java.util.Arrays;

public class Foods {
    public static void main(String[] args) {

        String morningFood = "Egg";
        String lunchFood = "Soup";
        String dinnerFood = "Meat";

        String[] saturdayFoods = {morningFood, "Soup", dinnerFood};
        System.out.println(Arrays.toString(saturdayFoods));

        //create an array for sunday foods
        String sundayFoods[] = {"Potato", "Mushroom", "Pizza"};

        //put those 2 arrays in a variable
        //firstWeekendMenu

        // String[] firstWeekendMenu[] = {saturdayFoods, sundayFoods};
        String[] firstWeekendMenu[] = {
                saturdayFoods,
                {"Potato", "Mushroom", "Pizza"}
        };

        System.out.println(Arrays.deepToString(firstWeekendMenu));
        System.out.println(firstWeekendMenu[0][1]);
        System.out.println(firstWeekendMenu[1][2]);
        System.out.println(Arrays.toString(firstWeekendMenu[0]));
        System.out.println(Arrays.toString(firstWeekendMenu[1]));

        //second week weekend menu

        // Saturday    Beans   Carrot   Cauliflower
        // Sunday      Hummus  Chicken  Chickpeas
        String[] secondSaturday = {"Beans", "Carrot", "Cauliflower"};
        //                            0          1         2
        String[] secondSunday = {"Hummus", "Chicken", "Chickpeas"};
        String[] secondWeekendMenu[] = new String[2][3];
        secondWeekendMenu[0] = secondSaturday;
        secondWeekendMenu[1] = secondSunday;
        //third weekend
        String[] thirdSaturday = {"egg", "chicken", "burger"};
        String[] thirdSunday = {"Soup", "Dumpling", "Fruit"};
        //                        0        1
        String[][] thirdWeekendMenu = {
                thirdSaturday,
                thirdSunday
        };

        String[][] februaryWeekendMenu[] = new String[3][2][3];
        februaryWeekendMenu[0] = firstWeekendMenu;
        februaryWeekendMenu[1] = secondWeekendMenu;
        februaryWeekendMenu[2] = thirdWeekendMenu;


        //  firstweekend  secondweekend   thirdweekend
        //      0              1                2
        System.out.println(februaryWeekendMenu[2][1][1]);

        System.out.println(februaryWeekendMenu[1][0][2]);


        for (String[][] weekends : februaryWeekendMenu) {
            for (String[] days : weekends) {
                for (String foods : days) {
                    System.out.println(foods);
                }
            }
        }


    }
}
