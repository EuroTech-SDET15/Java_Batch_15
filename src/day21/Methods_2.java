package day21;

public class Methods_2 {
    public static void main(String[] args) {

        //create a method, 1 string parameter, 1 int parameter(birthyear)
        //print age of the name
        //David is 27 years old
        printAgeOfTheName("David", 1991);
        String name = "Linda";
        int birthYear = 2000;
        printAgeOfTheName(name, birthYear);
        elligiblityOfTheName("Ali",2000);
        elligiblityOfTheName("Messi",2020);
    }

    public static void printAgeOfTheName(String name, int birthYear) {
//        int age = 2024 - birthYear;
        int age = calculateAge(birthYear);
        System.out.println(name + " is " + age + " years old.");
        System.out.println(name + " is " + calculateAge(birthYear) + " years old.");
        System.out.printf("%s is %d years old.\n", name, age);

    }

    //calculate age  , birthyear
    //return age

    public static int calculateAge(int birthYear) {
//        int age = 2024 - birthYear;
//        return age;
        return 2024 - birthYear;
    }

    //create a method isElligibleForVoting  1 birthyear
    //if elligible return true else return false

    public static boolean isElligibleForVoting(int birthYear) {
        int age = calculateAge(birthYear);
//        if (age >= 18) {
//            return true;
//        } else {
//            return false;
//        }
        boolean elligible = age >= 18 ? true : false;
        return elligible;
    }

    //create a method as a parameter name,birthyear
    // elligiblityOfTheName
    //return Ali is elligible
    //Messi is not elligible

    public static void elligiblityOfTheName(String name, int birthYear) {
//ali is elligible for voting
        if(isElligibleForVoting(birthYear)){
            System.out.println(name+" is elligible.");
        }else{
            System.out.println(name+" is not elligible.");
        }


    }


}
