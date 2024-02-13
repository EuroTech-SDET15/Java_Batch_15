package day41;

public class Student {

    Student(String firstName) {
        this.name = firstName;
    }

    Student() {

    }

    private String name;
    String surName;
    private int birthYear;
    private char gender;// m-f

    public void setGender(char gen) {
        this.gender = gen;
    }

    public char getGender() {
        return this.gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    String getName() {
        return this.name;
    }

    public void setBirthYear(int year) {
        if (year < 2005 || year > 2015) {
            year = 2005;
        }
        this.birthYear = year;
    }

    public void setName(String name) {
        this.name = name;
    }


}
