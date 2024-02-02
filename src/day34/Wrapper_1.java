package day34;

import java.util.ArrayList;
import java.util.Arrays;

public class Wrapper_1 {
    public static void main(String[] args) {
        Integer obj = new Integer(10);
        System.out.println(obj);
        Integer obj2 = Integer.valueOf(20);
        System.out.println(obj2);
        Integer obj3 = 60;//boxing converting primitive data to object
        int num = obj3;//unboxing  converting object to primitive value
        System.out.println(num);
        System.out.println(obj2 * num);
        ArrayList<Double> doubleValues;
        Double obj4 = new Double(54.38);
        System.out.println(obj4);
        Character character = new Character('A');
        Character character1 = Character.valueOf('A');
        Character character2 = 'B';
        System.out.println("character1 = " + character1);
        byte b = 125;
        Byte byte1 = new Byte(b);
        Byte byte2 = Byte.valueOf((byte) 100);
        System.out.println("byte2 = " + byte2);
        System.out.println("byte1 = " + byte1);
        short s = 500;
        Short short1 = new Short(s);
        System.out.println("short1 = " + short1);
        Byte obj6 = (byte) 250;
        System.out.println("obj6 = " + obj6);


        Byte obj7 = Byte.valueOf((byte) 20);
        byte byte5 = 20;
        Byte obj8 = Byte.valueOf(byte5);


        System.out.println("Byte max = " + Byte.MAX_VALUE);
        System.out.println("Short max = " + Short.MAX_VALUE);
        System.out.println("Integer max =" + Integer.MAX_VALUE);
        System.out.println("Float max =" + Float.MAX_VALUE);
        System.out.println("Double max =" + Double.MAX_VALUE);
        System.out.println("Long max =" + Long.MAX_VALUE);
//create obj from each wrapper class then print it
        Short obj9 = Short.valueOf((short) 100);
        Integer obj10 = Integer.valueOf(900);
        Float float1 = Float.valueOf(65.8f);
        Double double2 = Double.valueOf(68.97);
        Boolean boolean1 = Boolean.valueOf(true);
        Character character3 = Character.valueOf('Q');
        Long long1 = Long.valueOf(6987);

//        100
        String str = "100";
        int expected = 100;
//        System.out.println(str == expected);
        int number = Integer.parseInt(str);
        System.out.println(number == expected);
        System.out.println(number);
        int num2 = Integer.valueOf(str);

        System.out.println("Ali is 40 years old");
        expected = 40;
        String str5 = "Ali is 40 years old";
        //              0  1  2
        String[] array1 = str5.split(" ");
        System.out.println(Arrays.toString(array1));
        System.out.println(array1[2]);
        System.out.println(str5.split(" ")[2]);

        // "Bulls Newyork : 100-90"
        // "Orlando NewJersey : 118-87"
        // "Toronto NewOrleans : 120-115"

        String[] scores = {"Bulls Newyork : 100-90", "Orlando NewJersey : 118-87",
                "Toronto NewOrleans : 120-115", "Washington Detroits : 94-80"
        };
        //int firstnumber
        //int secondnumber


        Character character4 = 'B';
        System.out.println(Character.isLetter(character4));
        System.out.println(Character.isLetter(' '));
        System.out.println(Character.isLetter('5'));
        String str8 = "12H1354E6578L123L89453O1";
        //how can we extract letters
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('b'));
        int num9 = 50;
        String s1 = num9 + "";
        String s2 = String.valueOf(num9);



    }
}
