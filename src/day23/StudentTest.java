package day23;

public class StudentTest {
    public static void main(String[] args) {
        int number;
        Student student1;
        student1 = new Student();
        Student student2 = new Student();
        student1.name = "David";
        student1.studentId = 10;
        student1.gender = 'm';

        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println("student1.studentId = " + student1.studentId);

        student2.name = "Marry";
        student2.gender = 'f';
        student2.studentId = 15;

        System.out.println("student2.name = " + student2.name);
        System.out.println("student2.gender = " + student2.gender);
        System.out.println("student2.studentId = " + student2.studentId);

        System.out.println("student1.name = " + student1.name);
        student1.makePractise();
        student2.makePractise();
        student1.printStudentInfo();
        student2.printStudentInfo();

        System.out.println("Student.nameOfTheSchool = " + Student.nameOfTheSchool);



    }
}
