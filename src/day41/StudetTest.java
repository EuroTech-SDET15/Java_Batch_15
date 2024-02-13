package day41;

public class StudetTest {
    public static void main(String[] args) {
        Student student1 = new Student("Michael");

        Student student2 = new Student();

        String student1Name = student1.getName();

        System.out.println(student1Name);

        System.out.println(student1.getBirthYear());

        student1.setBirthYear(2001);

        System.out.println("student1.getBirthYear() = " + student1.getBirthYear());

        System.out.println("student2.getName() = " + student2.getName());

        student2.setName("Marry");

        System.out.println("student2.getName() = " + student2.getName());//Marry

        Student student3=new Student("Messi");

        student3.setBirthYear(1000);

        System.out.println(student3.getBirthYear());//2005

        student3.setBirthYear(5000);

        System.out.println(student3.getBirthYear());//2005
        student1.setGender('M');
        System.out.println("student1.getGender() = " + student1.getGender());
        student2.setGender('F');
        System.out.println("student2.getGender() = " + student2.getGender());


    }
}
