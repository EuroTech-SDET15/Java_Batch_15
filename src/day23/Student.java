package day23;

class Student {
    //fields,properties,attributes
    String name;
    int studentId;
    char gender;

    static String nameOfTheSchool = "Eurotech Study";

    void study() {
        System.out.println("Student is studying lesson.");
    }

    public void makePractise() {
        System.out.println(name);
        System.out.println(name + " is solving codingbat java questions");
        //David is solving codingbat java questions.
        //Marry is solving codingbat java questions.
    }

    public void printStudentInfo() {
        System.out.println("Name of the student is " + name);
        System.out.println(name + "'s student number is " + studentId);
        System.out.println(name + "'s gender is " + gender);
    }

    //printStudentInfo

    //name of the student is David
    //number of the studentId= 15
    //Gender of David is 'm'

    //if a method is static call it by class name

}
