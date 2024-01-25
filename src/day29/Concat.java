package day29;

public class Concat {
    public static void main(String[] args) {
        //create a method ==> fullName
        //2 parameters String String
        //get the first name and surname
        //return full name
        String wholeName = fullName("Ali", "Oz");
        String name = "Speedy";
        String surName = "Gonsales";
        fullName(name, surName);
        sayHello(wholeName);

        sayHello(fullName("Messi","Ramos"));

    }

    public static String fullName(String firstName, String lastName) {
        String wholeName = firstName.concat(lastName);
        return wholeName;
    }

    //get the whole name and say Hello
    public static void sayHello(String wholeName) {
        // Hello Ali Oz
        System.out.println("Hello ".concat(" " + wholeName));
    }

}
