package day8;

public class RelationalOprPractice {

    public static void main(String[] args) {

        System.out.println("//////////////// equal to //////////////////");
        //
        int student1Grade = 10;
        int student2Grade = 30;
        int student3Grade = 20;
        int student4Grade = 20;

        int team1scores = student1Grade + student2Grade;
        int team2scores = student3Grade + student4Grade;

        System.out.println("team1scores is equal to team2scores ? => " + (team1scores == team2scores));

        String text1 = "Java is good.";
        String text2 = "Java is awesome.";
        System.out.println("text1 == text2 = " + (text1 == text2)); // not use == for Strings!
        // we will learn more useful method to check equality of strings


        System.out.println("//////////////// NOT equal to //////////////////");
        int num1 = 10;
        int num2 = 11;
        int num3 = 10;

        System.out.println("num1 == num2 -> is equal to" + (num1 == num2));  // false
        System.out.println("num1 != num2 -> is NOT equal to " + (num1 != num2)); // true
        System.out.println("num1 != num3 -> is NOT equal to " + (num1 != num3)); // false

        System.out.println("/////////////////Greater and less than/////////////////");
        int actualNum = 15;
        int expectedNum = 10;

        boolean testResult
                = (actualNum > expectedNum);
        System.out.println("testResult = " + testResult);

        testResult = actualNum < expectedNum;
        System.out.println("testResult = " + testResult);

        System.out.println("/////////////////Greater - less than or Equal /////////////////");

        int grade = 40;

        int examPassGrade = 40;

        boolean examResult = grade >= examPassGrade;
        System.out.println("examResult = " + examResult);

        grade = 40;

        boolean didIfailTheExam = grade < examPassGrade;

    }

}
