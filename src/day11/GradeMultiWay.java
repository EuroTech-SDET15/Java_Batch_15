package day11;

public class GradeMultiWay {
    public static void main(String[] args) {

        int mark = 95;
        String grade = "";

        if (mark <= 100 && mark >= 90) {
            grade = "A";
        }
        if (mark <= 89 && mark >= 81) {
            grade = "B";
        }
        if (mark <= 80 && mark >= 69) {
            grade = "C";
        }
        if (mark <= 69 && mark >= 41) {
            grade = "D";
        }
        if (mark <= 40 && mark >= 0) {
            grade = "E";
        }
        System.out.println("grade = " + grade);
        ////////////////


        if (mark > 100 || mark < 0) {
            grade = "INVALID!!";
        } else if (mark >= 90) {
            grade = "A";
        } else if (mark >= 81) {
            grade = "B";
        } else if (mark >= 70) {
            grade = "C";
        } else if (mark >= 41) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("grade = " + grade);
    }
}

