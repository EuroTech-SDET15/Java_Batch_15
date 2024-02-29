package day52.player;

import java.time.LocalDate;

public abstract class Person {

    //  Person   name   age  birthyear  gender --> initialise in the constructor
    //  eating  sleeping

    //  Player   teamName   country   jerseyNumber       training     playing  abstract

    //  BasketballPlayer salary                                      playing   -->playing basketball
    //  FootballPlayer                                               playing   ---> playing football

    String name;
    int age;
    int birthYear;
    char gender;

    Person(String name, int birthYear, char gender) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        // age = 2024 - birthYear;
        age = LocalDate.now().getYear() - birthYear;
    }

    public void eating() {
        System.out.println(name + " is eating.");
    }

    public void sleeping() {
        System.out.println(name + " is sleeping.");
    }


}
