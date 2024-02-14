package day42;

public class StaticMembers {

    static int staffNumbers;  // static field


    public static void  getStaffNumber(){
        System.out.println("staffNumbers = " + staffNumbers);
        System.out.println("Math.PI = " + Math.PI);
    }

    {
      // instance code block!!!
    }

    static{
        // static code block!!!
    }
}
