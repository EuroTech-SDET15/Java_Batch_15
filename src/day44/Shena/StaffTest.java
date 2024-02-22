package day44.Shena;
import java.util.Scanner;

public class StaffTest {

    /*
    Write a program
    - Register new staff: use scanner!!
    - id(set automatic), full name(mandatory) , role (mandatory), salary (will set after registration finish!)
    - store each staff info separately
    - to provide or to see staff's salary, HR staff should provide password!!
    - if the password is correct, then set/update staff's salary
    - if the password is wrong, then give a warning message "Unauthorized access!!"

    Sample input/Output:
    "
    Eurotech Ltd Welcome to HR Portal!!
     Please enter the new Staff full name:
       Jonny Cash
     Please enter the new Staff role:
       SDET
     Thank you! New staff Jonny Cash inserted our HR portal with staff id 10001.

     Please enter your HR password to add new staff Salary:
      ******
     Password correct, now please enter SALARY:
      50000
     Salary added to staff data!
     "

     EXTRA:
     1- let's assume that we already have 50 staff!! and update code with this one!!! (last staff id was 10050)
     2- rather than asking HR admin password for each get set salary function, ask in the beginning then according to first
     result, set or get salary!!
       means: when a user enters the correct password in the beginning just once!!!, then never ask password again,
       set get salary directly to this user

     3- ADD YOUR OWN REQUIREMENT AT LEAST 1 and update code!!!
     */


    public static void main(String[] args) {
        registerStaff();
    }


    public static void registerStaff(){

        Staff staff1 = new Staff();
        System.out.println(staff1);


        Staff staff2 = new Staff();
        System.out.println(staff2);

        System.out.println(staff1);



    }

}


