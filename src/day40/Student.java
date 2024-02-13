package day40;

public class Student {
    //name
    //surname
    //birthyear
    private String name;
    private String surname;
    private int birthYear;

    Student(String name, String s, int b) {
        this.name = name;
        this.surname = s;
        birthYear = b;
    }

    public int getBirthYear() {
        return birthYear;
    }

    String getSurname() {
        return this.surname;
    }

    String getName() {
        return name;
    }

    //i will not allow to change those fields out of the class
    //but i will allow to learn values


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


