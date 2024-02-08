package day38;

public class Student {
    Long studentId;
    String name;
    int age;
    String postcode;
    boolean status;
    char gender;

    // only with these 3 input options, the system can create a Student registration
    // and whenever a student registers, his/her status will be true!!

    // opt-1 studentId,name
    public Student(long studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        status = true;
    }

    // opt-2 studentId,name, gender
    public Student(long studentId, String name, char gender) {
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        status = true;
    }


    // opt-3 studentId,name, gender, postcode
    public Student(long studentId, String name, String postcode, char gender) {
        this.studentId = studentId;
        this.name = name;
        this.postcode = postcode;
        this.gender = gender;
        status = true;
    }


    // opt-4 if there is no any info related student, create a student record with empty default values
    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "\n\tstudentId=" + studentId +
                ", \n\tname='" + name + '\'' +
                ", \n\tage=" + age +
                ", \n\tpostcode='" + postcode + '\'' +
                ", \n\tstatus=" + status +
                ", \n\tgender=" + gender +
                "\n}";
    }

    public static void main(String[] args) {
//      Student s1 = new Student('M');
        Student s1 = new Student(1001,"John");
        Student s2 = new Student(1002,"Julie", 'F');
        Student s3 = new Student(1001,"Mike", "NE12 3EN",'M');
        Student s4 = new Student();

        System.out.println(s3.toString());

    }


}


