package day55.Test;

import day55.Test.Sub.TestSub;

public class TestParent {


    public static void twoDivisionCalculation(int num1, int num2,
                                              int num3, int num4){
        TestSub.calculator(num1,num2);
        TestSub.calculator(num3,num4);
    }
}
