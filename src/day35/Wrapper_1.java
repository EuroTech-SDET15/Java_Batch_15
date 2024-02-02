package day35;

import day30.Student;

import java.util.ArrayList;

public class Wrapper_1 {
    public static void main(String[] args) {
        int number = 10000;
        String str = "Hello";
        System.out.println(str instanceof String);
        Integer obj = new Integer(10000);
        System.out.println(obj);
        System.out.println(number);
        Double obj2 = new Double(67.64);
        System.out.println(obj2);
        Boolean obj3 = Boolean.valueOf(true);
        System.out.println(obj3);
        Boolean obj4 = Boolean.valueOf("false");
        Character character = Character.valueOf('A');
        ArrayList<Integer> numbers;
        System.out.println(obj == number);
        Integer obj6 = new Integer(10000);
        System.out.println(obj == obj6);//comparing addresses
        //reference variables keeps address of the object
        System.out.println(obj6);
        System.out.println(obj);
        int num = obj;// unboxing  , converting object to primitive type
        System.out.println(num);
        Integer obj11 = num;// boxing ,converting primitive value  to object
        double doubleVal = 123.12;
        int number5 = (int) doubleVal;
        System.out.println(obj6.equals(obj6));
        Integer obj7 = new Integer(10000);
        int num5 = 50;
        String strungNum = num5 + "";
        String string = obj7.toString();

        str = "He ate 3 apples";
        System.out.println(Character.isDigit(str.charAt(0)));
        System.out.println(Character.isLetter(str.charAt(0)));
        System.out.println(Character.isLowerCase(str.charAt(0)));
        System.out.println(obj4 instanceof Boolean);

        Double obj10 = new Double(10.9);
        double double3 = obj10;
        Double obj01 = double3;

        String str5 = " true ";
        Boolean convertedBoolean = Boolean.valueOf(str5.trim());
        System.out.println("convertedBoolean = " + convertedBoolean);
        str5 = "123.12";
        double doubleConverted = Double.parseDouble(str5);
        System.out.println("doubleConverted = " + doubleConverted);
        doubleConverted = Double.valueOf(str5);
        System.out.println("doubleConverted = " + doubleConverted);
        str = "123";
        num = Integer.parseInt(str);
        System.out.println(num);


    }
}
