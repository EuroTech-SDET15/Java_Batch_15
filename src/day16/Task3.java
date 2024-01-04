package day16;

public class Task3 {

    public static void main(String[] args) {
        //Initialize an integer variable “number” to  30. Write a loop that will print “in the loop”
        // while the variable is more than 20,after each print reduces value to “1” (number -1)
        int number = 30;

        while(number>20){
            System.out.println("in the loop and number is " + number);
            number--;
        }
    }
}
