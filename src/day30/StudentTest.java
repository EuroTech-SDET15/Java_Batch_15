package day30;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Marry";
        Student student2 = new Student();
        student2.name = "Ronaldo";
        student2.name = "Ali";
        printName(student1);
        System.out.println("student1.name = " + student1.name);
        student1.schoolNumber = 101;
        student2.schoolNumber = 102;
    }

    public static void printName(Student student) {
        System.out.println(student.name);

    }


}
