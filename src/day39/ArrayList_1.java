package day39;

import day30.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
//        ArrayList<double> doubleVal = new ArrayList<>();Type argument cannot be of primitive type

        numbers.add(10);
        numbers.add(20);
        //[10, 20]
        //  0  1
        System.out.println("numbers = " + numbers);
        numbers.add(1, 50);
        //[10, 50  ,20]
        // 0   1     2
        System.out.println("numbers = " + numbers);
        ArrayList<Integer> copy = new ArrayList<>();
        copy.add(100);
        copy.addAll(numbers);
        System.out.println("copy = " + copy);
//        copy.add(10,60);
//        System.out.println(copy);
        ArrayList<Integer> copy2 = new ArrayList<>();
        copy2.add(5000);
        copy2.add(1000);
        copy2.add(200);
        copy2.add(1600);
        System.out.println("copy2 = " + copy2);
        copy2.addAll(2, numbers);
        System.out.println("copy2 = " + copy2);
        System.out.println(numbers.get(1));
        System.out.println("numbers = " + numbers);
        //[10, 500, 20]
        numbers.set(1, 500);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.add(100);
        numbers.add(300);
//        numbers.remove(500); Index 500 out of bounds for length 4
        System.out.println("numbers = " + numbers);
        Integer index = 10;
        numbers.remove(index);
        System.out.println("numbers = " + numbers);
        int in = 10;
        numbers.remove(index);
        System.out.println("numbers = " + numbers);
//        numbers.remove(index);
        System.out.println("index = " + index);
//        numbers.remove(500);Index 500 out of bounds for length 3
        System.out.println("numbers = " + numbers);
        numbers.add(150);
        numbers.add(250);
        numbers.add(450);
        System.out.println("numbers = " + numbers);
        numbers.removeIf(n -> n < 200);//if any element is less then 200 remove it
        System.out.println("numbers = " + numbers);
        numbers.add(121);
        numbers.add(5);
        numbers.add(50);
        numbers.add(75);
        numbers.add(160);
        System.out.println("numbers = " + numbers);
        numbers.removeIf(x -> x % 2 == 1);
        System.out.println("numbers = " + numbers);
        int num = 12;
        System.out.println(num % 2 != 0);
        System.out.println(num % 2 == 1);

        System.out.println("fifty inside the numbers = "+numbers.contains(50));
        Integer fifty = 50;

        System.out.println(numbers.contains(fifty));
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.indexOf(450) = " + numbers.indexOf(450));
        System.out.println("numbers.indexOf(1450) = " + numbers.indexOf(1450));
        numbers.add(450);
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.lastIndexOf(450) = " + numbers.lastIndexOf(450));

        Collections.sort(numbers);
        System.out.println("numbers = " + numbers);
        Collections.reverse(numbers);
        System.out.println("numbers = " + numbers);


    }
}
