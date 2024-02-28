package day51.enums;

public class Student {

    String name;
    int number;

    Countries country;
    static int counter = 101;

    Student() {
        this.number = counter;
        counter++;
    }

    Student(String name, Countries country) {
        this.name = name;
        this.country = country;
        this.number = counter;
        counter++;
    }

    public void study() {
        System.out.println(name + " is studying lesson.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", country=" + country +
                '}';
    }
}
