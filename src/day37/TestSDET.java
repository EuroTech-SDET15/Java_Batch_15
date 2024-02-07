package day37;

public class TestSDET {

    public static void main(String[] args) {

        SDET staff1= new SDET("Sneha",45,'F'
                ,"Google",100000);
        System.out.println("staff1.company = " + staff1.company);
        System.out.println("staff1.salary = " + staff1.salary);

        SDET staff2= new SDET("Cevahir",15,'F',"BMW",60000);

        SDET staff3= new SDET("Filiz",24,'F',"Amazon",80000);

        SDET staff4= new SDET("Gulay",34,'F',"Home Office",160000);

        SDET staff5= new SDET("Sarita",60,'F',"MasterCard",200000);
        staff5.changeCompany("Visa");

//        SDET staff6 = new SDET();

        System.out.println("staff1 = " + staff1.toString());

    //        SDET staff7;
    //        staff7.age=22;
    //        staff7.changeCompany("BBC");
    }
}
