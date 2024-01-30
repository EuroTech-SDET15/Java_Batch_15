package day32;

public class Arrays_2 {
    public static void main(String[] args) {
        int[] numbers = {10, 30, 8, 60, 70};
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
        printFirstSecond(numbers);
        int[] scores = {88, 65, 78, 96};
        printFirstSecond(scores);
        printFirstSecond(scores, 1);
        //   String[] names = {"Cevahir,Filiz,Gulay,Hasna,Rosana,Sarita,Sneha"};length of that array is 1
        String[] names = {"Cevahir", "Filiz", "Gulay", "Hasna", "Rosana", "Sarita", "Sneha"};
        System.out.println(names.length);
        printArray(names);
        String actualName = lastElement(names);
        System.out.println(actualName.equals("Sneha"));
        String expectedName = "Sneha";
        if (actualName.equals(expectedName)) {
            System.out.println("Passed!!");
        } else {
            System.out.println("Failed!!!");
        }
        numbers = new int[]{10, 30, 8, 60, 70};
        System.out.println(firstElement(numbers));

    }

    //return first element
    static int firstElement(int[] numbers) {
        return numbers[0];
    }


    //return last element
    static String lastElement(String[] names) {
        int index = names.length - 1;
//        System.out.println(names[index]);
        String name = names[index];
        return name;
    }

    //printArray
    //print element by foreach loop

    static void printArray(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    static void printFirstSecond(int[] nums, int index) {
        if (index < nums.length) {
            System.out.println(nums[index]);
        }
    }


    static void printFirstSecond(int[] nums) {
        System.out.println(nums[0]);
        System.out.println(nums[1]);
    }

    static void printFirstSecond(String name) {

    }

    static void printFirstSecond(int number) {

    }


}
