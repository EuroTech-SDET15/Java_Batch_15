package day51.enums;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Cevahir";
        //101
//        student1.country = "USA";
        student1.country = Countries.USA;
        Student student2 = new Student();//102
        student2.name = "Gulay";
        // student2.country = "Turkey";
        student2.country = Countries.TURKEY;
        Student student3 = new Student();//103
        student3.name = "Hasna";
        // student3.country = "Turkey";
        student3.country = Countries.TURKEY;
        Student student4 = new Student();
        student4.name = "Rosana";
//        student4.country = "Macedonia";
        student4.country = Countries.MACEDONIA;
        Student student5 = new Student();
        student5.name = "Sarita";
//        student5.country = "India";
        student5.country = Countries.INDIA;

        Student student6 = new Student("Filiz", Countries.GERMANY);



        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        System.out.println(student5.toString());
        System.out.println(student6.toString());

        Student student7=new Student("Sneha",Countries.INDIA);
        System.out.println(student7.toString());

    }
}
