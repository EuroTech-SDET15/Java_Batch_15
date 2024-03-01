package day53;

import day23.Car;
import day30.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctinalInterfaces {


    public static void main(String[] args) {
        Consumer printer = n -> System.out.println(n);

        printer.accept(10);
        printer.accept("Oslo");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, -3, 10));

        for (int i = 0; i < numbers.size(); i++) {
            // System.out.println(numbers.get(i));
            //printer.accept(i);//0  1  2
            printer.accept(numbers.get(i));// 5 3 10
        }
        System.out.println("================");
        for (int n : numbers) {
            System.out.println(n);
        }

        System.out.println("=====================");

        numbers.forEach(x -> printer.accept(x));
        System.out.println("===========");
        numbers.forEach(System.out::println);
        System.out.println("==========");

        Predicate<Integer> isPositive = b -> b > 0;

        System.out.println(isPositive.test(-10));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(isPositive.test(numbers.get(i)));
        }

    }


    public void print1(){

    }




}
