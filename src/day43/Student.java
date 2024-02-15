package day43;

public class Student {

    // Create a class to keep each student info separately
    // fields name, className, dob, studentId, schoolName
    // we are creating this app for Star School.
    // studentId should initialize automatically when we create a student record
    // student id should be start 5 digits and increment by +1
    // set two functions: 1- print related student's all data fields to together
    //                    2- school has quota 100, write a method to return remaining space
    // prepare TestStudent class and register five students


    // EXTRA STEP:
    // I want to print the object values and remaining space automatically,
    // whenever I register a student


    // EXTRA STEP -2:
    // let's assume that we already have 50 students in our school.
    // and I want to print 2 messages to parents before each registration complete!!:
        // Message 1: "School Rules: ......."
        // Message 2: "School Policy: ......"

    String name;
    String className;
    String dob;
    int studentId= 9999;
    static String schoolName= "Star School";
    static int totalStudentCount;

    {
        System.out.println("Message 1: School Rules: .......");
        System.out.println("Message 2: School Policy: .......");
    }
    static {
        totalStudentCount = 50;
    }

    public Student(String name, String className, String dob) {
        this.name = name;
        this.className = className;
        this.dob = dob;

        totalStudentCount++;
        studentId += totalStudentCount;

        System.out.println(this);
        remainingSpace();

    }

    public static void remainingSpace(){
        if(totalStudentCount>99){
            System.out.println("School is full! Get out of the office!!");
            return;
        }
        System.out.println(
                "Remaining Space " + (100 - totalStudentCount));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", dob='" + dob + '\'' +
                ", studentId=" + studentId +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
