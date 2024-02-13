package day40;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Hanry", "Kane", 2006);
        //                                String     String   int
        //  student1.name = "Ronaldo";
        //  student1.surname="";
        System.out.println(student1.getName());//
        System.out.println(student1.getSurname());
        System.out.println(student1.getBirthYear());
        Student student2 = new Student("Michael", "Jordan", 2000);
        System.out.println(student2.getName());
        System.out.println(student2.getSurname());
        System.out.println(student2.getBirthYear());
         // AccountHolder
        System.out.println(student1.toString());
        System.out.println(student2.toString());


    }
}
