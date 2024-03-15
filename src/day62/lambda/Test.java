package day62.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        TestGreet greet = new TestGreet();
        greet.greet("Ronaldo");

//        Greet greet1 = new Greet() {
//            @Override
//            public void greet(String name) {
//                System.out.println("Hi " + name);
//            }
//        };
//        parameter -> expression
        Greet greet1 = (name) -> System.out.println("Hi " + name);

        greet1.greet("Messi!!");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ali", "Marry", "Frank", "France"));
        //Hi Ali HI Marry Hi Frank

        names.stream().forEach(name -> System.out.println("hi " + name));
        names.stream().forEach(System.out::println);
        System.out.println("=====================");
        //Fr

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).contains("Fr")) {
                System.out.println(names.get(i));
            }
        }
        System.out.println("==================");

        names.stream().filter(name -> name.contains("Fr")).forEach(System.out::println);

        names.stream().map(n -> "Hi " + n).forEach(System.out::println);
        names.stream().map(n -> n.charAt(n.length() - 1)).forEach(System.out::println);


        List<String> fr = names.stream().filter(name -> name.contains("Fr")).collect(Collectors.toList());
        System.out.println("fr = " + fr);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 50, 90, 100, 30, 40));
        //numbers less then 45
        //i m searching
        numbers.stream().filter(n -> n < 45).forEach(System.out::println);
        //                   if number less then 45     print

        // 10 * 10   50 * 50  90 * 90 100 * 100  30 *30 40 * 40
        // i m changing
        List<Integer> collect = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("collect = " + collect);
        numbers = new ArrayList<>(Arrays.asList(10, 50, 90, 100, 30, 40,10,50));
        numbers.stream().map(n -> n * 2).distinct().forEach(System.out::println);
        // print if it is unique

        System.out.println("BYE BYE!!!!!");
    }
}
