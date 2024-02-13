package day41;

import java.util.ArrayList;

public class ListOfObject {

    public static void main(String[] args) {

        int num1 = 2, num2 = 3, num3 = 11;
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(num1);
        numList.add(num2);
        numList.add(num3);

        // working in IT team
        Staff staff1 = new Staff("Adam", 1, 10000);
        Staff staff2 = new Staff("Ela", 2, 20000);
        Staff staff3 = new Staff("Jack", 3, 30000);
        Staff staff33;

        System.out.println("staff1 = " + staff1);

        ArrayList<Staff> itStaff= new ArrayList<>();
        itStaff.add(staff1);
        itStaff.add(staff2);
        itStaff.add(staff3);
//        itStaff.add(staff33);

        System.out.println(itStaff);

        // working in Finance
        Staff staff4 = new Staff("Lenard", 4, 40000);
        Staff staff5 = new Staff("Tarik", 5, 50000);

        ArrayList<Staff> financeStaff= new ArrayList<>();
        financeStaff.add(staff4);
        financeStaff.add(staff5);

    }
}
