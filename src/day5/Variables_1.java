package day5;

public class Variables_1 {
    public static void main(String[] args) {
        byte var1;//decleration
//        System.out.println(var1);Variable 'var1' might not have been initialized
        var1 = 20;
        System.out.println(var1);
        var1 = 50;
        System.out.println(var1);
        float interestRate = 5.7f;// 4 byte  32 bit
        System.out.println(interestRate);

        double taxRate = 25.4;// 8 byte 64 bit
        System.out.println(taxRate);
        taxRate = 24;//implicitly being converted  integer-->double
        System.out.println(taxRate);
        interestRate = 6;
        System.out.println(interestRate);

        interestRate = 5.123456789f;
        System.out.println("interestRate = " + interestRate);
        taxRate = 23.1234567890123456789;
        System.out.println("taxRate = " + taxRate);
        //1234567
        long dayNumber = 5;
        byte dNum = 6;




    }

}
