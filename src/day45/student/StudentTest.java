package day45.student;

public class StudentTest {
    public static void main(String[] args) {
        UniStudent uniStudent = new UniStudent();
        uniStudent.name = "David";
        uniStudent.study();
        uniStudent.scholarship = 900;

        HighStudent highStudent = new HighStudent();
        highStudent.name = "Marry";
        highStudent.study();
        uniStudent.makeInternship();


    }
}
