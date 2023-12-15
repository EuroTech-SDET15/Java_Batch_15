package day9;

public class ReviewWeek1_2 {


    public static void main(String[] args) {


        int AdecimalValue = 65;

        char Acharacter = 'A';
        System.out.println("Acharacter = " + Acharacter);

        char Avalue = 65;
        System.out.println("Avalue = " + Avalue);

        Avalue = (char) AdecimalValue;
        System.out.println("Avalue = " + Avalue);

        char UwithGrave = 217;
        System.out.println("UwithGrave = " + UwithGrave);

        char weirdo = 10059;

        System.out.println("weirdo = " + weirdo);

        int println;
//        last-name
        int AnnualSalary;
//        "hi"
        int KFC;
        //  43isTheAnswer
        //  for
        int sum_of_data;
        int _average;
        int B5;


        //

        // TASK -0

        int a = 3; // 4 5

        System.out.println(a++ + a++ + a); // 3 + 4 + 5
        System.out.println("a = " + a);


        // TASK -1
        int num1 = 5; // 6,5
        int num2 = 3; // 4,5
        double expression2 = ++num1 - (num1-- * num2++) * num2++;
/*
                           = 6 - (6 * 3 ) * 4
                           = 6 - 18 * 4
                           = 6 - 72  == -66
*/




        // task-2

        int aa = 3;
        int b = aa++;
        System.out.println("b = " + b); //3
        System.out.println("aa = " + aa); //4


        // TASK -3
        int n1 = 5; //
        int n2 = 3; //
        double expression1 = --n1 / ++n2 - (n1 * n2++) * --n1 + ++n2;



        /////////

        double rate = 10;


        System.out.println("1 == 1.0 = " + (1 == 1.0));
        int aaa=1;
        double bbb=1.0;
        System.out.println("aaa==bbb = " + (aaa == bbb));
        System.out.println("aaa = " + aaa);


        ////////

        int value = (int)1.9999;



        // TASK-4

        int numA = 4; // 5 , 6
        int numB = 5; // 6

        System.out.println((++numA < numB) && (numA++ == numB++) );
                       //=    5    <  5    &&    5    ==   5

        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);


        numA = 4;
         numB = 5;
        System.out.println((++numA == numB) && (++numA < numB)  || (numA > numB++));

        System.out.println("numA = " + numA);
    }

}
